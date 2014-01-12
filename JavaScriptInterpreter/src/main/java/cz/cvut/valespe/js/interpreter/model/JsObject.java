package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;

import java.util.Collections;
import java.util.List;

/**
 * Java Script inner representation of object
 */
public abstract class JsObject {

    protected Memory.Reference selfRef;
    protected Memory.Reference prototype;
    private boolean mark = false;

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

    public boolean isSymbol() {
        return false;
    }

    public boolean isJsArray() {
        return false;
    }

    public boolean isJsBoolean() {
        return false;
    }

    public abstract Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory);

    public abstract Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory);

    public abstract Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory);

    public Scope getScope() {
        return new Scope();
    }

    public Memory.Reference getSelfReference() {
        return this.selfRef;
    }

    public void setSelfReference(Memory.Reference reference) {
        selfRef = reference;
    }

    public Memory.Reference getPrototype() {
        return prototype;
    }

    public void setPrototype(Memory.Reference prototype) {
        this.prototype = prototype;
    }

    public boolean isMark() {
        return mark;
    }

    public void mark() {
        mark = true;
    }

    public void unmark() {
        mark = false;
    }

    public List<Memory.Reference> getAllReferences() {
        return Collections.emptyList();
    }
}
