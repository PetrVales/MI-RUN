package cz.cvut.valespe.js.interpreter

import org.junit.Test

class PrototypesTest extends IntegrationTest {

    @Test
    public void "count rectangel sourface"() {
        runScript("/Prototypes.js")

        assertValueOfVariable("aA", 1)
        assertValueOfVariable("bA", 1)
        assertValueOfVariable("bB", 2)
        assertValueOfVariable("cA", 20)
        assertValueOfVariable("cC", 3)
    }

}
