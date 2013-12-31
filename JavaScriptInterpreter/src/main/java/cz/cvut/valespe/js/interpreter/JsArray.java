package cz.cvut.valespe.js.interpreter;

import java.util.List;

public class JsArray extends JsObject {

    private List<Memory.Reference> array;

    public JsArray(List<Memory.Reference> arrayRefs) {
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
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Object is not function.");
    }

    @Override
    public Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Object is not function.");
    }

    @Override
    public boolean isJsArray() {
        return true;
    }
}
