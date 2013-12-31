package cz.cvut.valespe.js.interpreter

import org.junit.Before
import org.junit.Test

class PrintTest extends IntegrationTest {

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
        runScript("/Print.js")

        assert reader.readLine() == "aaa"
        assert reader.readLine() == "1"
        assert reader.readLine() == "a"
        assert reader.readLine() == "1"
    }

}
