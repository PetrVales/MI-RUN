package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.parser.JavaScriptParser;

import java.util.List;

/**
 * Runtime representation of Java Script function
 */
public class Function {

    private List<String> params;
    private JavaScriptParser.BlockContext body;

    public Function(List<String> params, JavaScriptParser.BlockContext body) {
        this.params = params;
        this.body = body;
    }

    public boolean isFunction() {
        return true;
    }

    public List<String> getParams() {
        return params;
    }

    public JavaScriptParser.BlockContext getBody() {
        return body;
    }

}
