package cz.cvut.valespe.js.interpreter;

import java.util.List;

/**
 * TODO javadoc
 */
public class JsInstance extends JsObject {

    private Scope objectScope;

    public JsInstance(Scope callScope, JsFunction jsFunction) {
        //To change body of created methods use File | Settings | File Templates.
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
        } else {
            throw new TypeError(function + " is not function of object.");
        }
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        throw new TypeError("Object is not function.");
    }

    @Override
    public Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
