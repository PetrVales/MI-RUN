package cz.cvut.valespe.js.interpreter

import org.junit.Test

class ControlStructuresTest extends IntegrationTest {

    @Test
    public void "can do if"() {
        runScript("/If.js")

        assertValueOfVariable("x", 1)
        assertValueOfVariable("y", 2)
        assertValueOfVariable("z", 1)
    }

    @Test
    public void "can do while"() {
        runScript("/While.js")

        assertValueOfVariable("i", 10)
    }
}
