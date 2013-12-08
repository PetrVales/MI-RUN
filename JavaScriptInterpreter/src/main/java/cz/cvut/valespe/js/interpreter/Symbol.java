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
    public JsObject invoke(String function, List<JsObject> args) {
        throw new TypeError("Can't invoke function on symbol.");
    }

    @Override
    public JsObject invoke(List<JsObject> args) {
        throw new TypeError("Symbol is not function.");
    }
}
