package cz.cvut.valespe.js.interpreter

import org.junit.Test

class RectangelTest extends IntegrationTest {

    @Test
    public void "count rectangel sourface"() {
        runScript("/Rectangel.js")

        assertValueOfVariable("surface1", 200)
        assertValueOfVariable("surface2", 200)
    }

}
