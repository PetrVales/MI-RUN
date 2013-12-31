package cz.cvut.valespe.js.interpreter

import org.junit.Test

class WorkWithObjectInstanceTest extends IntegrationTest {

    @Test
    public void "interpret instance messaging"() {
        runScript("/WorkWithObjectInstance.js")

        assertValueOfVariable("w", 1)
        assertValueOfVariable("x", 2)
        assertValueOfVariable("y", 3)
        assertValueOfVariable("z", 4)
    }

}
