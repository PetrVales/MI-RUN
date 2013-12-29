package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

class InterpretSimpleObjectTest {

    private Memory memory = new Memory()
    private Scope scope = new Scope()

    @Test
    public void "interpret simple object creation"() {
        def stream = InterpretSimpleExpressionsTest.class.getResourceAsStream("/SimpleObject.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))

        def variableRef = scope.get("x")
        assert null != memory.getJsObject(variableRef)
    }

    @Test
    public void "interpret simple object with a property"() {
        def stream = InterpretSimpleExpressionsTest.class.getResourceAsStream("/ObjectWithProperties.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))

        def variableRefX = scope.get("x")
        JsInstance x = (JsInstance) memory.getJsObject(variableRefX)
        def variableRefY = scope.get("y")
        JsInstance y = (JsInstance) memory.getJsObject(variableRefY)
        def variableRefZ = scope.get("z")
        JsInstance z = (JsInstance) memory.getJsObject(variableRefZ)
        assert x != null
        assert memory.getJsObject(x.@objectScope.get("a")).value() == 1
        assert y != null
        assert memory.getJsObject(y.@objectScope.get("a")).value() == 1
        assert memory.getJsObject(y.@objectScope.get("b")).value() == 3
        assert z != null
        assert memory.getJsObject(z.@objectScope.get("c")).value() == 4
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
        InterpreterVisitor javaScriptVisitor = new InterpreterVisitor(memory, scope, scope)
        file.accept(javaScriptVisitor)
        file
    }

}
