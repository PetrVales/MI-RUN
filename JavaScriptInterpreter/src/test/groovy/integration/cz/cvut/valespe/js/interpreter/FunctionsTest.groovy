package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.interpreter.model.LoadFunction
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
        def loadRef = memory.storeJsObject(new LoadFunction())
        scope.set("load", loadRef)

        runScript("/Load.js")

        def functionRefA = scope.get("A")
        def functionRefB = scope.get("B")
        def functionRefC = scope.get("C")

        assert memory.getJsObject(functionRefA).isJsObject()
        assert memory.getJsObject(functionRefB).isJsObject()
        assert memory.getJsObject(functionRefC).isJsObject()
    }

}
