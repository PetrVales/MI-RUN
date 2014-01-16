package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.DefinitionCollectingVisitor;
import cz.cvut.valespe.js.interpreter.InterpreterVisitor;
import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;
import cz.cvut.valespe.js.parser.JavaScriptLexer;
import cz.cvut.valespe.js.parser.JavaScriptParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoadFunction extends JsFunction {

    public LoadFunction() {
        super("load", Arrays.asList("uri"), null, null);
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        JsObject jsObject = memory.getJsObject(args.get(0));
        if (jsObject.isSymbol()) {
            final Memory.Reference reference = invokeScope.get((String) jsObject.value());
            jsObject = memory.getJsObject(reference);
        }
        String uri = (String) jsObject.value();
        String code = loadFile(uri);
        collectDefinitions(parseCode(code), invokeScope, memory);
        return null;
    }

    @Override
    public List<Memory.Reference> getAllReferences() {
        return Collections.emptyList();
    }

    private String loadFile(String uri) {
        final InputStream inputStream = LoadFunction.class.getResourceAsStream(uri);
        try {
            return IOUtils.toString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

    private void collectDefinitions(JavaScriptParser.FileContext file, Scope scope, Memory memory) {
        DefinitionCollectingVisitor definitionCollectingVisitor = new DefinitionCollectingVisitor(memory, scope);
        file.accept(definitionCollectingVisitor);
        InterpreterVisitor interpreterVisitor = new InterpreterVisitor(memory, scope, scope);
        file.accept(interpreterVisitor);
    }

}