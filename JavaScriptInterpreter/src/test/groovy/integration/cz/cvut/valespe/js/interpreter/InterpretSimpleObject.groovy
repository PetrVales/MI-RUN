package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

class InterpretSimpleObject {

    private Memory memory = new Memory()
    private Scope scope = new Scope()

    @Test
    public void "interpret simple object creation"() {
        def stream = InterpretSimpleExpressions.class.getResourceAsStream("/SimpleObject.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))

        def variableRef = scope.get("x")
        assert null != memory.getJsObject(variableRef)
    }

    def private parseCode(code) {
        CharStream charStream = new ANTLRInputStream(code)
        JavaScriptLexer lex = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill()
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true)
        return parser.file()
    }

    def private collectDefinitions(JavaScriptParser.FileContext file) {
        DefinitionCollectingVisitor definitionCollectingVisitor = new DefinitionCollectingVisitor(memory, scope)
        file.accept(definitionCollectingVisitor)
        file
    }

    def private interpretFile(JavaScriptParser.FileContext file) {
        InterpreterVisitor javaScriptVisitor = new InterpreterVisitor(memory, scope)
        file.accept(javaScriptVisitor)
        file
    }

}
