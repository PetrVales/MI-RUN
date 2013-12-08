package cz.cvut.valespe.js.interpreter;

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
}