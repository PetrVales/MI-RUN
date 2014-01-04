package cz.cvut.valespe.js.interpreter

import org.junit.Test

class IfTest extends IntegrationTest {

    @Test
    public void "perform if"() {
        runScript("/If.js")

        assertValueOfVariable("x", 1)
        assertValueOfVariable("y", 2)
        assertValueOfVariable("z", 1)
    }
}
