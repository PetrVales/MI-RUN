package cz.cvut.valespe.js.interpreter

import org.junit.Test

class InterpretSimpleExpressionsTest extends IntegrationTest {

    @Test
    public void "interpret simple expression file"() {
        runScript("/ExpressionsSimplified.js")

        assert scope.getDefinedNames() == ["a", "b", "c", "d"] as Set
        assertValueOfVariable("a", 5)
        assertValueOfVariable("b", 23)
        assertValueOfVariable("c", 28)
        assertValueOfVariable("d", "aaaa")
    }

    @Test
    public void "interpret invoke function file"() {
        runScript("/InvokeFunction.js")

        assert scope.get("a") == null
        assertValueOfVariable("b", 3)
        assertValueOfVariable("c", 6)
        assertValueOfVariable("d", 3)
        assertValueOfVariable("e", 12)
        assertValueOfVariable("f", 2)
        assertValueOfVariable("g", 11)
        assert scope.get("h") != null
        assertValueOfVariable("i", 16)
        assertValueOfVariable("j", 17)
    }

}
