package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

class DefinitionCollectingVisitorTest {

    private Memory memory = new Memory();
    private Scope scope = new Scope();

    @Test
    public void "collect var definitions in js file"() {
        def stream = InterpretSimpleExpressions.class.getResourceAsStream("/ExpressionsSimplified.js")
        collectDefinitions(parseCode(stream.text))

        assert ["a", "b", "c"] as Set == scope.@scope.keySet()
        assert null == scope.get("a")
        assert null == scope.get("b")
        assert null == scope.get("c")
    }

    @Test
    public void "collect var definitions with assignment in js file"() {
        def stream = InterpretSimpleExpressions.class.getResourceAsStream("/Expressions.js")
        collectDefinitions(parseCode(stream.text))

        assert ["a", "b", "c"] as Set == scope.@scope.keySet()
        assert null == scope.get("a")
        assert null == scope.get("b")
        assert null == scope.get("c")
    }

    @Test
    public void "collect function definitions in js file"() {
        def stream = InterpretSimpleExpressions.class.getResourceAsStream("/FunctionDeclaration.js")
        collectDefinitions(parseCode(stream.text))

        assert ["a", "b", "f1", "f2"] as Set == scope.getDefinedNames()
        assert null == scope.get("a")
        assert null == scope.get("b")

        def f1Ref = scope.get("f1")
        def f2Ref = scope.get("f2")
        def f1 = memory.getJsObject(f1Ref)
        def f2 = memory.getJsObject(f2Ref)


        assert f1.isJsFunction()
        assert [] as Set == f1.@scope.getDefinedNames()
        assert f2.isJsFunction()
        assert ["x", "c", "f3"] as Set == f2.@scope.getDefinedNames()

        def f3Ref = f2.@scope.get("f3")
        def f3 = memory.getJsObject(f3Ref)

        assert ["f4"] as Set == f3.@scope.getDefinedNames()

        def f4Ref = f3.@scope.get("f4")
        def f4 = memory.getJsObject(f4Ref)

        assert ["x"] as Set == f4.@scope.getDefinedNames()
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
    }


}
