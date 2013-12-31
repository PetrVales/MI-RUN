package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream

class IntegrationTest {

    protected Memory memory = new Memory()
    protected Scope scope = new Scope()

    def protected runScript(String script) {
        def stream = InterpretSimpleExpressionsTest.class.getResourceAsStream(script)
        interpretFile(collectDefinitions(parseCode(stream.text)))
    }

    def protected parseCode(code) {
        CharStream charStream = new ANTLRInputStream(code)
        JavaScriptLexer lex = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill()
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true)
        return parser.file()
    }

    def protected collectDefinitions(JavaScriptParser.FileContext file) {
        DefinitionCollectingVisitor definitionCollectingVisitor = new DefinitionCollectingVisitor(memory, scope)
        file.accept(definitionCollectingVisitor)
        file
    }

    def protected interpretFile(JavaScriptParser.FileContext file) {
        InterpreterVisitor javaScriptVisitor = new InterpreterVisitor(memory, scope, scope)
        file.accept(javaScriptVisitor)
        file
    }

    def protected assertValueOfVariable(String variable, value) {
        def variableRef = scope.get(variable)
        assert memory.getJsObject(variableRef).value() == value
    }
}
