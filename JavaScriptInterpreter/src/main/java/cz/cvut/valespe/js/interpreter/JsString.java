package cz.cvut.valespe.js.interpreter;

import java.util.List;

/**
 * TODO javadoc
 */
public class JsString extends JsObject {
    private String text;

    public JsString(String text) {
        this.text = text;
    }

    @Override
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Memory.Reference constructInstance(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object value() {
        return text;
    }
}
