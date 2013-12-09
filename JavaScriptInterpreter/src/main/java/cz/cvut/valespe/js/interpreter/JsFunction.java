package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.parser.JavaScriptParser;

import java.util.List;

/**
 * Runtime representation of Java Script function
 */
public class JsFunction extends JsObject {

    private final String name;
    private final List<String> params;
    private final JavaScriptParser.FunctionBodyContext body;
    private final Scope scope;

    public JsFunction(String name, List<String> params, JavaScriptParser.FunctionBodyContext body, Scope scope) {
        this.name = name;
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
    public Memory.Reference invoke(String function, List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        return null;
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        Scope callScope = new Scope(scope, invokeScope);
        for (int i = 0; i < args.size(); i++)
            callScope.set(params.get(i), args.get(i));
        if (name != null) {
            callScope.define(name);
            callScope.set(name, selfRef);
        }
        Memory.Reference resultRef = (Memory.Reference) body.accept(new InterpreterVisitor(memory, callScope));
        if (resultRef != null && memory.getJsObject(resultRef).isSymbol())
            resultRef = callScope.get((String) memory.getJsObject(resultRef).value());
        return resultRef;
    }

    public List<String> getParams() {
        return params;
    }

    public JavaScriptParser.FunctionBodyContext getBody() {
        return body;
    }


}
