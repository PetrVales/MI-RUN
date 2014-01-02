package cz.cvut.valespe.js.interpreter

import org.junit.Test

class BooleanTest extends IntegrationTest {

    @Test
    public void "use boolean"() {
        runScript("/Boolean.js")

        assertValueOfVariable("a", true)
        assertValueOfVariable("b", false)
        assertValueOfVariable("c", false)
        assertValueOfVariable("d", true)
        assertValueOfVariable("e", false)
    }

}
