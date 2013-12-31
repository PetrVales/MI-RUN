package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.interpreter.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime memory, where objects can be stored and retrieved later. Memory can be cleaned from unused objects.
 */
public class Memory {

    private static final int MEMORY_MAX_SIZE = 1000;

    private List<JsObject> memory = new ArrayList<JsObject>(MEMORY_MAX_SIZE);
    private int index = 0;

    /**
     * Retrieve object stored on specified address
     * @param reference into memory, where object is stored
     * @return objected stored on given address
     * @throws cz.cvut.valespe.js.interpreter.model.ReferenceError when no object is stored on given address
     */
    public JsObject getJsObject(Reference reference) {
        final JsObject value = memory.get(reference.address);
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
        if  (index < MEMORY_MAX_SIZE)
            memory.add(index, object);
        else
            throw new cz.cvut.valespe.js.interpreter.model.OutOfMemoryError();
        object.setRerence(new Reference(index));
        return new Reference(index++);
    }

    /**
     * Removes objects, which are not referenced anymore, from memory. Root objects and their (recursive) references remain in memory.
     * @param roots List of address of root object
     */
    public void gc(List<Reference> roots) {
            // TODO GC
//        List<JsObject> newMemory = new ArrayList<JsObject>(MEMORY_MAX_SIZE);
//        gc(newMemory, roots);
    }
//        for (Reference reference : references) {
//            JsObject object = memory.get(reference.address);
//            newMemory.add(newIndex);
//        }
//    }

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
