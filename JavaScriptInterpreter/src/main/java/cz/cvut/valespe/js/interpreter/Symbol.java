package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.interpreter.model.JsObject;
import cz.cvut.valespe.js.interpreter.model.TypeError;

import java.util.Collections;
import java.util.List;

/**
 * TODO javadoc
 */
public class Symbol extends JsObject {
    private final String text;

    public Symbol(String text) {
        this.text = text;
    }

    @Override
    public Object value() {
        return text;
    }

    @Override
    public boolean isSymbol() {
        return true;
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Can't invoke function on symbol.");
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Symbol is not function.");
    }

    @Override
    public Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Can't construct instance from symbol.");
    }

    @Override
    public List<Memory.Reference> getAllReferences() {
        return Collections.emptyList();
    }

}
