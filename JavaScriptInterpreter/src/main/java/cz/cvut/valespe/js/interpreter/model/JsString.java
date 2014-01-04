package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;

import java.util.*;

/**
 * Runtime representation of String
 */
public class JsString extends JsInstance {
    private String text;
    private Map<String, JsFunction> methods = new HashMap<String, JsFunction>();

    public JsString(String text) {
        super(new Scope());
        this.text = text;
        methods.put("split", new SplitFunction());
        methods.put("length", new LengthFunction());
        methods.put("==", new EqualsFunction());
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        final JsFunction jsFunction = methods.get(function);
        return jsFunction.invoke(args, invokeScope, memory);
    }

    @Override
    public Object value() {
        return text;
    }

    private class SplitFunction extends JsFunction {

        public SplitFunction() {
            super("split", Arrays.asList("separator"), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            JsObject regexp = memory.getJsObject(args.get(0));
            if (!regexp.isJsString())
                throw new TypeError("Invalid argument");
            final String[] strings = text.split((String) regexp.value());
            List<Memory.Reference> splits = new ArrayList<Memory.Reference>(strings.length);
            for (String split : strings) {
                splits.add(memory.storeJsObject(new JsString(split)));
            }
            return memory.storeJsObject(new JsArray(splits));
        }

    }

    private class LengthFunction extends JsFunction {

        public LengthFunction() {
            super("length", Collections.<String>emptyList(), null, null);
        }

        @Override
        public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
            return memory.storeJsObject(new JsInt(text.length()));
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
                return memory.storeJsObject(new JsBoolean(value().equals(other.value())));
            }
            throw new TypeError("Cant't % non Int object.");
        }

    }

}
