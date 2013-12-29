package cz.cvut.valespe.js.interpreter;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class PrintFunction extends JsFunction {

    private PrintStream printStream;

    public PrintFunction(PrintStream printStream) {
        super("print", Arrays.asList("text"), null, null);
        this.printStream = printStream;
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
