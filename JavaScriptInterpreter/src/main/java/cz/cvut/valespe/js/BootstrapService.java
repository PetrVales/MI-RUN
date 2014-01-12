package cz.cvut.valespe.js;

import cz.cvut.valespe.js.interpreter.DefinitionCollectingVisitor;
import cz.cvut.valespe.js.interpreter.InterpreterVisitor;
import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;
import cz.cvut.valespe.js.interpreter.model.*;
import cz.cvut.valespe.js.parser.JavaScriptLexer;
import cz.cvut.valespe.js.parser.JavaScriptParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class BootstrapService {

    private final Memory memory = new Memory(this);
    private final Scope scope = new Scope();

    public BootstrapService() {
        addPrintFunction();
        addLoadFunction();
        addReadFunction();
    }

    public void runScript(String script, String[] args) {
        addArgsVariable(args);
        interpretFile(collectDefinitions(parseCode(loadFile(script))));
    }

    private void addArgsVariable(String[] args) {
        List<Memory.Reference> argRefs = new ArrayList<Memory.Reference>(args.length);
        for (String arg : args) {
            argRefs.add(memory.storeJsObject(new JsString(arg))) ;
        }
        Memory.Reference argsRef = memory.storeJsObject(new JsArray(argRefs));
        scope.set("args", argsRef);
    }

    private String loadFile(String uri) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(uri));
            return IOUtils.toString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                IOUtils.closeQuietly(inputStream);
        }
        return "";
    }

    private JavaScriptParser.FileContext parseCode(String code) {
        CharStream charStream = new ANTLRInputStream(code);
        JavaScriptLexer lex = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill();
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true);
        return parser.file();
    }

    private JavaScriptParser.FileContext collectDefinitions(JavaScriptParser.FileContext file) {
        DefinitionCollectingVisitor definitionCollectingVisitor = new DefinitionCollectingVisitor(memory, scope);
        file.accept(definitionCollectingVisitor);
        return file;
    }

    private JavaScriptParser.FileContext interpretFile(JavaScriptParser.FileContext file) {
        InterpreterVisitor javaScriptVisitor = new InterpreterVisitor(memory, scope, scope);
        file.accept(javaScriptVisitor);
        return file;
    }

    private void addPrintFunction() {
        Memory.Reference printRef = memory.storeJsObject(new PrintFunction(System.out));
        scope.set("print", printRef);
    }

    private void addLoadFunction() {
        Memory.Reference printRef = memory.storeJsObject(new LoadFunction());
        scope.set("load", printRef);
    }

    private void addReadFunction() {
        Memory.Reference printRef = memory.storeJsObject(new ReadFunction());
        scope.set("read", printRef);
    }

    public void outOfMemory() {
        memory.gc(scope.getAllReferences());
    }

}
