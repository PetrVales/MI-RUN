package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;

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
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        JsObject that = memory.getJsObject(args.get(0));
        JsInt result = null;
        if (!that.isJsInt())
            throw new TypeError("Can't call " + function + " with non Int arg.");
        else if ("+".equals(function))
            result = plus((JsInt) that);
        else if ("-".equals(function))
            result = minus((JsInt) that);
        else if ("*".equals(function))
            result = mul((JsInt) that);
        else if ("/".equals(function))
            result = div((JsInt) that);
        else if ("%".equals(function))
            result = mod((JsInt) that);
        else
            throw new TypeError("Unknown function: " + function + " for type Int.");
        return memory.storeJsObject(result);
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Number is not function.");
    }

    @Override
    public Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Can't construct instance from Int.");
    }

    @Override
    public Object value() {
        return value;
    }
}
