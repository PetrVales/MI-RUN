package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

import static org.mockito.Matchers.any
import static org.mockito.Mockito.mock
import static org.mockito.Mockito.times
import static org.mockito.Mockito.verify

class VisitorTests {

    def scope = mock(Scope.class)

    @Test
    public void "visit INT"() {
        assert 1 == getFileContextFor("1").file().accept(new JavaScriptVisitor())
        assert 99 == getFileContextFor("99").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit PLUS"() {
        assert 13 == getFileContextFor("11 + 2").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit MINUS"() {
        assert 9 == getFileContextFor("11 - 2").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit MUL"() {
        assert 22 == getFileContextFor("11 * 2").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit DIV"() {
        assert 5 == getFileContextFor("11 / 2").file().accept(new JavaScriptVisitor())
        assert 6 == getFileContextFor("12 / 2").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit MOD"() {
        assert 1 == getFileContextFor("11 % 2").file().accept(new JavaScriptVisitor())
        assert 0 == getFileContextFor("12 % 2").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit 11 + 2 + 99"() {
        assert 112 == getFileContextFor("11 + 2 + 99").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit 11 + 2 + 99 - 20"() {
        assert 92 == getFileContextFor("11 + 2 + 99 - 20").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit 11 + 2 + 99 - 10 * 3"() {
        assert 82 == getFileContextFor("11 + 2 + 99 - 10 * 3").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit 11 + 2 + 99 - 10 * 3 / 5"() {
        assert 106 == getFileContextFor("11 + 2 + 99 - 10 * 3 / 5").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "visit 11 + 2 + (99 - 10) * 3 / 5"() {
        assert 66 == getFileContextFor("11 + 2 + (99 - 10) * 3 / 5").file().accept(new JavaScriptVisitor())
    }

    @Test
    public void "create anonymous function"() {
        def parser = getFileContextFor("function() { }")
        def function = parser.file().accept(new JavaScriptVisitor())

        assert function != null
        assert function,isFunction()
        assert function.params == []
        assert function.body.toStringTree(parser) == "(block { })"
    }

    @Test
    public void "create anonymous function with params"() {
        def parser = getFileContextFor("function(a, b) { }")
        def function = parser.file().accept(new JavaScriptVisitor())

        assert function != null
        assert function,isFunction()
        assert function.params == ["a", "b"]
        assert function.body.toStringTree(parser) == "(block { })"
    }

    @Test
    public void "create anonymous function with params and with body"() {
        def parser = getFileContextFor("function(a, b) { 1 + 2 }")
        def function = parser.file().accept(new JavaScriptVisitor())

        assert function != null
        assert function,isFunction()
        assert function.params == ["a", "b"]
        assert function.body.toStringTree(parser) != null
        assert 3 == function.body.accept(new JavaScriptVisitor())
    }

    @Test
    public void "declare function"() {
        def parser = getFileContextFor("function a() { }")
        def function = parser.file().accept(new JavaScriptVisitor(scope))

        assert function != null
        assert function,isFunction()
        assert function.params == []
        assert function.body.toStringTree(parser) == "(block { })"

        verify(scope, times(1)).set("a", function)
    }

    @Test
    public void "declare variable"() {
        getFileContextFor("var a").file().accept(new JavaScriptVisitor(scope))

        verify(scope, times(1)).define("a")
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

}
