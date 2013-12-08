package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import cz.cvut.valespe.js.parser.JavaScriptParser.FileContext
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

class InterpretSimpleExpressions {

    private Memory memory = new Memory()
    private Scope scope = new Scope()

    @Test
    public void "interpret simple expression file"() {
        def stream = InterpretSimpleExpressions.class.getResourceAsStream("/ExpressionsSimplified.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))

        assert ["a", "b", "c"] as Set == scope.getDefinedNames()
        def aRef = scope.get("a")
        def bRef = scope.get("b")
        def cRef = scope.get("c")
        assert 5 == memory.getJsObject(aRef).value()
        assert 23 == memory.getJsObject(bRef).value()
        assert 28 == memory.getJsObject(cRef).value()
    }

    @Test
    public void "interpret invoke function file"() {
        def stream = InterpretSimpleExpressions.class.getResourceAsStream("/InvokeFunction.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))
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

    def private interpretFile(FileContext file) {
        InterpreterVisitor javaScriptVisitor = new InterpreterVisitor(memory, scope)
        file.accept(javaScriptVisitor)
        file
    }
}
