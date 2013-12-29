package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.parser.JavaScriptLexer
import cz.cvut.valespe.js.parser.JavaScriptParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Before
import org.junit.Test

class PrintTest {

    private Memory memory = new Memory()
    private Scope scope = new Scope()
    private BufferedReader reader;

    @Before
    public void init() {
        PipedInputStream pipeInput = new PipedInputStream();
        reader = new BufferedReader(new InputStreamReader(pipeInput));
        PrintStream out = new PrintStream(new PipedOutputStream(pipeInput));

        def printRef = memory.storeJsObject(new PrintFunction(out))
        scope.set("print", printRef)
    }

    @Test
    public void "print to output"() {
        def stream = InterpretSimpleExpressionsTest.class.getResourceAsStream("/Print.js")
        interpretFile(collectDefinitions(parseCode(stream.text)))

        assert reader.readLine() == "aaa"
        assert reader.readLine() == "1"
        assert reader.readLine() == "a"
        assert reader.readLine() == "1"
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

    def private assertValueOfVariable(String variable, value) {
        def variableRef = scope.get(variable)
        assert value == memory.getJsObject(variableRef).value()
    }

}
