package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;

import java.util.*;

/**
 * Runtime representation of Integer
 */
public class JsInt extends JsInstance {

    private final Integer value;
    private Map<String, JsFunction> methods = new HashMap<String, JsFunction>();

    public JsInt(Integer value) {
        super(new Scope());
        this.value = value;
        methods.put("+", new PlusFunction());
        methods.put("-", new MinusFunction());
        methods.put("*", new MulFunction());
        methods.put("/", new DivFunction());
        methods.put("%", new ModFunction());
        methods.put(">", new MoreFunction());
        methods.put("<", new LessFunction());
        methods.put("==", new EqualsFunction());
    }

    @Override
    public boolean isJsInt() {
        return true;
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        final JsFunction jsFunction = methods.get(function);
        return jsFunction.invoke(args, invokeScope, memory);
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

    @Override
    public List<Memory.Reference> getAllReferences() {
        return Collections.emptyList();
    }

    private class PlusFunction extends JsFunction {

        public PlusFunction() {
            super("+", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsInt(value + ((JsInt) other).value));
            }
            throw new TypeError("Cant't + non Int object.");
        }

    }

    private class MinusFunction extends JsFunction {

        public MinusFunction() {
            super("-", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsInt(value - ((JsInt) other).value));
            }
            throw new TypeError("Cant't - non Int object.");
        }

    }

    private class MulFunction extends JsFunction {

        public MulFunction() {
            super("*", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsInt(value * ((JsInt) other).value));
            }
            throw new TypeError("Cant't * non Int object.");
        }

    }

    private class DivFunction extends JsFunction {

        public DivFunction() {
            super("/", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsInt(value / ((JsInt) other).value));
            }
            throw new TypeError("Cant't / non Int object.");
        }

    }

    private class ModFunction extends JsFunction {

        public ModFunction() {
            super("%", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsInt(value % ((JsInt) other).value));
            }
            throw new TypeError("Cant't % non Int object.");
        }

    }

    private class MoreFunction extends JsFunction {

        public MoreFunction() {
            super(">", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsBoolean(value > ((JsInt) other).value));
            }
            throw new TypeError("Cant't % non Int object.");
        }

    }

    private class LessFunction extends JsFunction {

        public LessFunction() {
            super("<", Arrays.asList("other"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject other = memory.getJsObject(args.get(0));
            if (other.isJsInt()) {
                return memory.storeJsObject(new JsBoolean(value < ((JsInt) other).value));
            }
            throw new TypeError("Cant't % non Int object.");
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
