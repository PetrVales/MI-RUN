package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.BootstrapService;
import cz.cvut.valespe.js.interpreter.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Runtime memory, where objects can be stored and retrieved later. Memory can be cleaned from unused objects.
 */
public class Memory {

    private static final int MEMORY_MAX_SIZE = 1000;

    private final List<Reference> REFERENCES = new LinkedList<Reference>();
    private JsObject[] memory = new JsObject[MEMORY_MAX_SIZE];
    private Queue<Reference> freeReferences = new LinkedList<Reference>();
    private BootstrapService bootstrapService;

    public Memory(BootstrapService bootstrapService) {
        for (int i = 0; i < MEMORY_MAX_SIZE; i++)
            REFERENCES.add(new Reference(i));
        freeReferences.addAll(REFERENCES);
        this.bootstrapService = bootstrapService;
    }

    /**
     * Retrieve object stored on specified address
     * @param reference into memory, where object is stored
     * @return objected stored on given address
     * @throws ReferenceError when no object is stored on given address
     */
    public JsObject getJsObject(Reference reference) {
        final JsObject value = memory[reference.address];
        if (value != null)
            return value;
        else
            throw new ReferenceError();
    }

    /**
     * Store object in memory and return its address
     * @param object to store
     * @return address of stored object
     */
    public Reference storeJsObject(JsObject object) {
        if  (freeReferences.isEmpty()) {
            bootstrapService.outOfMemory();
            if  (freeReferences.isEmpty()) {
                throw new cz.cvut.valespe.js.interpreter.model.OutOfMemoryError();
            }
        }
        final Reference peek = freeReferences.poll();
        memory[peek.address] = object;
        object.setSelfReference(peek);
        return peek;
    }

    /**
     * Removes objects, which are not referenced anymore, from memory. Root objects and their (recursive) references remain in memory.
     * @param roots List of address of root object
     */
    public void gc(List<Reference> roots) {
        for (Reference root : roots)
            mark(root);
        sweep();
    }

    private void mark(Reference ref) {
        final JsObject object = getJsObject(ref);
        if (object.isMark())
            return;
        object.mark();
        for (Reference reference : object.getAllReferences()) {
            mark(reference);
        }
    }

    private void sweep() {
        for (Reference reference : REFERENCES) {
            final JsObject object = memory[reference.address];
            if (object != null && object.isMark()) {
                object.unmark();
            } else {
                memory[reference.address] = null;
                freeReferences.add(reference);
            }
        }
    }

    /**
     * Address into memory
     */
    public class Reference {
        int address;

        public Reference(int address) {
            this.address = address;
        }

    }

}
