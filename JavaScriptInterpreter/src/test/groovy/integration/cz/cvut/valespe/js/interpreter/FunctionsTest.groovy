package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.interpreter.model.PrintFunction
import org.junit.Before
import org.junit.Test

class FunctionsTest extends IntegrationTest {

    private BufferedReader reader;
    private PrintStream out;

    @Before
    public void init() {
        PipedInputStream pipeInput = new PipedInputStream();
        reader = new BufferedReader(new InputStreamReader(pipeInput));
        out = new PrintStream(new PipedOutputStream(pipeInput));
    }

    @Test
    public void "print to output"() {
        def printRef = memory.storeJsObject(new PrintFunction(out))
        scope.set("print", printRef)

        runScript("/Print.js")

        assert reader.readLine() == "aaa"
        assert reader.readLine() == "1"
        assert reader.readLine() == "a"
        assert reader.readLine() == "1"
    }

    @Test
    public void "load script file"() {
        runScript("/Load.js")

        def functionRefA = scope.get("A")
        def functionRefB = scope.get("B")
        def functionRefC = scope.get("C")
        def a = scope.get("a")
        def b = scope.get("b")
        def c = scope.get("c")
        def d = scope.get("d")

        assert memory.getJsObject(functionRefA).isJsObject()
        assert memory.getJsObject(functionRefB).isJsObject()
        assert memory.getJsObject(functionRefC).isJsObject()
        assert a != null
        assert b != null
        assert c != null
        assert d != null
    }

    @Test
    public void "load script file - chain"() {
        runScript("/LoadChain.js")

        def functionRefA = scope.get("A")
        def functionRefB = scope.get("B")
        def functionRefC = scope.get("C")
        def functionRefD = scope.get("D")
        def functionRefE = scope.get("E")
        def a = scope.get("a")
        def b = scope.get("b")
        def c = scope.get("c")
        def d = scope.get("d")
        def e = scope.get("e")
        def x = scope.get("x")
        def y = scope.get("y")

        assert memory.getJsObject(functionRefA).isJsObject()
        assert memory.getJsObject(functionRefB).isJsObject()
        assert memory.getJsObject(functionRefC).isJsObject()
        assert memory.getJsObject(functionRefD).isJsObject()
        assert memory.getJsObject(functionRefE).isJsObject()
        assert a != null
        assert b != null
        assert c != null
        assert d != null
        assert e != null
        assert x != null
        assert y != null
    }

    @Test
    public void "read file"() {
        runScript("/Read.js")

        assertValueOfVariable("x", "var x = read(\"/Read.js\")")
    }

}
