package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.parser.JavaScriptParser;

import java.util.List;

/**
 * Runtime representation of Java Script function
 */
public class JsFunction extends JsObject {

    private List<String> params;
    private JavaScriptParser.FunctionBodyContext body;
    private Scope scope;

    public JsFunction(List<String> params, JavaScriptParser.FunctionBodyContext body, Scope scope) {
        this.params = params;
        this.body = body;
        this.scope = scope;
    }

    @Override
    public Object value() {
        return body;
    }

    public boolean isJsFunction() {
        return true;
    }

    @Override
    public JsObject invoke(String function, List<JsObject> args) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JsObject invoke(List<JsObject> args) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<String> getParams() {
        return params;
    }

    public JavaScriptParser.FunctionBodyContext getBody() {
        return body;
    }


}
