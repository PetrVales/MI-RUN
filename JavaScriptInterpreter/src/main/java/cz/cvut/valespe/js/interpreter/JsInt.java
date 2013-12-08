package cz.cvut.valespe.js.interpreter;

import java.util.List;

/**
 * TODO javadoc
 */
public class JsInt extends JsObject {

    private final Integer value;

    public JsInt(Integer value) {
        this.value = value;
    }

    @Override
    public boolean isJsInt() {
        return true;
    }

    public JsInt plus(JsInt other) {
        return new JsInt(this.value + other.value);
    }

    public JsInt minus(JsInt other) {
        return new JsInt(this.value - other.value);
    }

    public JsInt mul(JsInt other) {
        return new JsInt(this.value * other.value);
    }

    public JsInt div(JsInt other) {
        return new JsInt(this.value / other.value);
    }

    public JsInt mod(JsInt other) {
        return new JsInt(this.value % other.value);
    }

    @Override
    public JsObject invoke(String function, List<JsObject> args) {
        if (!args.get(0).isJsInt())
            throw new TypeError("Can't call " + function + " with non Int arg.");
        if ("+".equals(function))
            return plus((JsInt) args.get(0));
        if ("-".equals(function))
            return minus((JsInt) args.get(0));
        if ("*".equals(function))
            return mul((JsInt) args.get(0));
        if ("/".equals(function))
            return div((JsInt) args.get(0));
        if ("%".equals(function))
            return mod((JsInt) args.get(0));
        throw new TypeError("Unknown function: " + function + " for type Int.");
    }

    @Override
    public JsObject invoke(List<JsObject> args) {
        throw new TypeError("Number is not function.");
    }

    @Override
    public Object value() {
        return value;
    }
}
