package cz.cvut.valespe.js.interpreter

import org.junit.Test

class InterpretSimpleObjectTest extends IntegrationTest {

    @Test
    public void "interpret simple object creation"() {
        runScript("/SimpleObject.js")

        assert memory.getJsObject(scope.get("x")) != null
    }

    @Test
    public void "interpret simple object with a property"() {
        runScript("/ObjectWithProperties.js")

        def variableRefX = scope.get("x")
        JsInstance x = (JsInstance) memory.getJsObject(variableRefX)
        def variableRefY = scope.get("y")
        JsInstance y = (JsInstance) memory.getJsObject(variableRefY)
        def variableRefZ = scope.get("z")
        JsInstance z = (JsInstance) memory.getJsObject(variableRefZ)
        assert x != null
        assert memory.getJsObject(x.@objectScope.get("a")).value() == 1
        assert y != null
        assert memory.getJsObject(y.@objectScope.get("a")).value() == 1
        assert memory.getJsObject(y.@objectScope.get("b")).value() == 3
        assert z != null
        assert memory.getJsObject(z.@objectScope.get("c")).value() == 4
    }

}
