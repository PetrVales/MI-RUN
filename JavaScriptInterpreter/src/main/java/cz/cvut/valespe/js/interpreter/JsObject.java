package cz.cvut.valespe.js.interpreter;

import java.util.Collections;
import java.util.List;

/**
 * Java Script inner representation of object
 */
public abstract class JsObject {

    protected Memory.Reference selfRef;

    public abstract Object value();

    public boolean isJsObject() {
        return true;
    }

    public boolean isJsFunction() {
        return false;
    }

    public boolean isJsInt() {
        return false;
    }

    public boolean isJsString() {
        return false;
    }

    public boolean isUserDefinedObject() {
        return false;
    }

    public boolean isSymbol() {
        return false;
    }

    public abstract Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory);

    public abstract Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory);

    public abstract Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory);

    public List<Memory.Reference> getReferences() {
        return Collections.EMPTY_LIST; // TODO
    }

    public Memory.Reference getRerence() {
        return this.selfRef;
    }

    public void setRerence(Memory.Reference rerence) {
        selfRef = rerence;
    }

}
