package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;

import java.util.List;

public class JsArray extends JsInstance {

    private List<Memory.Reference> array;

    public JsArray(List<Memory.Reference> arrayRefs) {
        super(new Scope());
        this.array = arrayRefs;
    }

    public Memory.Reference get(int index) {
        return array.get(index);
    }

    public void set(int index, Memory.Reference ref) {
        array.set(index, ref);
    }

    @Override
    public Object value() {
        return array;
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        if ("length".equals(function))
            return memory.storeJsObject(new JsInt(array.size()));
        else
            return null;
    }

    @Override
    public boolean isJsArray() {
        return true;
    }
}
