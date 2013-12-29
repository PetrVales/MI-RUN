package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import cz.cvut.valespe.js.parser.JavaScriptParser.FileContext
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

class InterpretSimpleExpressionsTest {

    private Memory memory = new Memory()
    private Scope scope = new Scope()

    @Test
    public void "interpret simple expression file"() {
        def stream = InterpretSimpleExpressionsTest.class.getResourceAsStream("/ExpressionsSimplified.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))

        assert ["a", "b", "c", "d"] as Set == scope.getDefinedNames()
        assertValueOfVariable("a", 5)
        assertValueOfVariable("b", 23)
        assertValueOfVariable("c", 28)
        assertValueOfVariable("d", "aaaa")
    }

    @Test
    public void "interpret invoke function file"() {
        def stream = InterpretSimpleExpressionsTest.class.getResourceAsStream("/InvokeFunction.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))
        assert null == scope.get("a")
        assertValueOfVariable("b", 3)
        assertValueOfVariable("c", 6)
        assertValueOfVariable("d", 3)
        assertValueOfVariable("e", 12)
        assertValueOfVariable("f", 2)
        assertValueOfVariable("g", 11)
        assert null != scope.get("h")
        assertValueOfVariable("i", 16)
        assertValueOfVariable("j", 17)
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
        InterpreterVisitor javaScriptVisitor = new InterpreterVisitor(memory, scope, scope)
        file.accept(javaScriptVisitor)
        file
    }

    def private assertValueOfVariable(String variable, value) {
        def variableRef = scope.get(variable)
        assert value == memory.getJsObject(variableRef).value()
    }

}
