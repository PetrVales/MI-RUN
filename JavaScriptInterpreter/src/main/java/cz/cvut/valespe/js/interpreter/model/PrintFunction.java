package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;
import cz.cvut.valespe.js.interpreter.model.JsFunction;
import cz.cvut.valespe.js.interpreter.model.JsObject;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintFunction extends JsFunction {

    private PrintStream printStream;

    public PrintFunction(PrintStream printStream) {
        super("print", Arrays.asList("text"), null, null);
        this.printStream = printStream;
    }

    @Override
    public List<Memory.Reference> getAllReferences() {
        return Collections.emptyList();
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        JsObject jsObject = memory.getJsObject(args.get(0));
        if (jsObject.isSymbol()) {
            final Memory.Reference reference = invokeScope.get((String) jsObject.value());
            jsObject = memory.getJsObject(reference);
        }
        printStream.println(jsObject.value());
        return null;
    }

}
