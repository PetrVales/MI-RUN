package cz.cvut.valespe.js.interpreter

import org.junit.Test

class ArrayTest extends IntegrationTest {

    @Test
    public void "use array"() {
        runScript("/Array.js")

        assertValueOfVariable("x", 1)
        assertValueOfVariable("y", 2)
        assertValueOfVariable("z", 300)
        assertValueOfVariable("length", 3)
    }

}
