package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

import static org.mockito.Mockito.mock

class VisitorTests {

    def memory = new Memory()
    def scope = mock(Scope.class)

    @Test
    public void "visit INT"() {
        def ref1 = getFileContextFor("1").file().accept(interpreterVisitor)
        def ref2 = getFileContextFor("99").file().accept(interpreterVisitor)

        assert 1 == memory.getJsObject(ref1).value()
        assert 99 == memory.getJsObject(ref2).value()
    }

    @Test
    public void "visit PLUS"() {
        def ref = getFileContextFor("11 + 2").file().accept(interpreterVisitor)
        assert 13 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit MINUS"() {
        def ref = getFileContextFor("11 - 2").file().accept(interpreterVisitor)
        assert 9 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit MUL"() {
        def ref = getFileContextFor("11 * 2").file().accept(interpreterVisitor)
        assert 22 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit DIV"() {
        def ref1 = getFileContextFor("11 / 2").file().accept(interpreterVisitor)
        def ref2 = getFileContextFor("12 / 2").file().accept(interpreterVisitor)

        assert 5 == memory.getJsObject(ref1).value()
        assert 6 == memory.getJsObject(ref2).value()
    }

    @Test
    public void "visit MOD"() {
        def ref1 = getFileContextFor("11 % 2").file().accept(interpreterVisitor)
        def ref2 = getFileContextFor("12 % 2").file().accept(interpreterVisitor)

        assert 1 == memory.getJsObject(ref1).value()
        assert 0 == memory.getJsObject(ref2).value()
    }

    @Test
    public void "visit 11 + 2 + 99"() {
        def ref = getFileContextFor("11 + 2 + 99").file().accept(interpreterVisitor)
        assert 112 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit 11 + 2 + 99 - 20"() {
        def ref = getFileContextFor("11 + 2 + 99 - 20").file().accept(interpreterVisitor)
        assert 92 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit 11 + 2 + 99 - 10 * 3"() {
        def ref = getFileContextFor("11 + 2 + 99 - 10 * 3").file().accept(interpreterVisitor)
        assert 82 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit 11 + 2 + 99 - 10 * 3 / 5"() {
        def ref = getFileContextFor("11 + 2 + 99 - 10 * 3 / 5").file().accept(interpreterVisitor)
        assert 106 == memory.getJsObject(ref).value()
    }

    @Test
    public void "visit 11 + 2 + (99 - 10) * 3 / 5"() {
        def ref = getFileContextFor("11 + 2 + (99 - 10) * 3 / 5").file().accept(interpreterVisitor)
        assert 66 == memory.getJsObject(ref).value()
    }

    @Test
    public void "create anonymous function"() {
        def parser = getFileContextFor("function() { }")
        def funRef = parser.file().accept(interpreterVisitor)
        def function = memory.getJsObject(funRef)

        assert null != function
        assert function,isJsFunction()
        assert [] == function.params
        assert "(functionBody { })" == function.body.toStringTree(parser)
    }

    @Test
    public void "create anonymous function with params"() {
        def parser = getFileContextFor("function(a, b) { }")
        def funRef = parser.file().accept(interpreterVisitor)
        def function = memory.getJsObject(funRef)

        assert null != function
        assert function,isJsFunction()
        assert ["a", "b"] == function.params.collect { memory.getJsObject(it).value() }
        assert "(functionBody { })" == function.body.toStringTree(parser)
    }

    @Test
    public void "create anonymous function with params and with body"() {
        def parser = getFileContextFor("function(a, b) { 1 + 2 }")
        def funRef = parser.file().accept(interpreterVisitor)
        def function = memory.getJsObject(funRef)
        def resultRef = function.body.accept(interpreterVisitor)

        assert null != function
        assert function.isJsFunction()
        assert ["a", "b"] == function.params.collect { memory.getJsObject(it).value() }
        assert null != function.body.toStringTree(parser)
        assert 3 == memory.getJsObject(resultRef).value()
    }

    def private getFileContextFor(code) {
        CharStream charStream = new ANTLRInputStream(code)
        JavaScriptLexer lex = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill()
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true)
        return parser
    }

    def private final getInterpreterVisitor() {
        new InterpreterVisitor(memory, scope)
    }

}
