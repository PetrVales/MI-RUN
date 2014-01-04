package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;

import java.util.*;

/**
 * Runtime representation of boolean
 */
public class JsBoolean extends JsInstance {

    private Boolean value;
    private Map<String, JsFunction> methods = new HashMap<String, JsFunction>();

    public JsBoolean(Boolean value) {
        super(new Scope());
        this.value = value;
        methods.put("&&", new AndFunction());
        methods.put("||", new OrFunction());
        methods.put("==", new EqualsFunction());
        methods.put("!", new NotFunction());
    }

    @Override
    public Object value() {
        return value;
    }

    @Override
    public boolean isJsBoolean() {
        return true;
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        final JsFunction jsFunction = methods.get(function);
        return jsFunction.invoke(args, invokeScope, memory);
    }

    private class AndFunction extends JsFunction {

        public AndFunction() {
            super("&&", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsBoolean()) {
                return memory.storeJsObject(new JsBoolean(value && ((JsBoolean) other).value));
            }
            throw new TypeError("Cant't && non Boolean object.");
        }

    }

    private class OrFunction extends JsFunction {

        public OrFunction() {
            super("||", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsBoolean()) {
                return memory.storeJsObject(new JsBoolean(value || ((JsBoolean) other).value));
            }
            throw new TypeError("Cant't || non Boolean object.");
        }

    }

    private class NotFunction extends JsFunction {

        public NotFunction() {
            super("!", Collections.<String>emptyList(), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            return memory.storeJsObject(new JsBoolean(!value));
        }

    }

    private class EqualsFunction extends JsFunction {

        public EqualsFunction() {
            super("==", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsBoolean(value.equals(other.value())));
            }
            throw new TypeError("Cant't % non Int object.");
        }

    }

}
