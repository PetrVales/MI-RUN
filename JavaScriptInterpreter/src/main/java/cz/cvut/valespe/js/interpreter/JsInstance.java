package cz.cvut.valespe.js.interpreter;

import java.util.List;

public class JsInstance extends JsObject {

    private Scope objectScope;

    public JsInstance(Scope objectScope) {
        this.objectScope = objectScope;
    }

    @Override
    public Object value() {
        return null;
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        final JsObject jsObject = memory.getJsObject(objectScope.get(function));
        if (jsObject != null && jsObject.isJsFunction()) {
            JsFunction jsFunction = (JsFunction) jsObject;
            return jsFunction.invoke(args, objectScope, memory);
        } else if (args == null) {
            return objectScope.get(function);
        } else {
            objectScope.set(function, args.get(0));
            return null;
        }
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Object is not function.");
    }

    @Override
    public Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Object is not function.");
    }

    @Override
    public Scope getScope() {
        return objectScope;
    }
}
