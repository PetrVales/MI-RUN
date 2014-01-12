package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.interpreter.model.JsInt
import cz.cvut.valespe.js.interpreter.model.ReferenceError
import org.junit.Test


class MemoryTest extends IntegrationTest {

    @Test(expected = ReferenceError.class)
    public void "gc collect garbage"() {
        runScript("/Rectangel.js")
        def intRef = memory.storeJsObject(new JsInt(1))

        memory.gc(new LinkedList(scope.getAllReferences()))

        memory.getJsObject(intRef)
    }

    @Test
    public void "gc preserve live object"() {
        runScript("/Rectangel.js")
        memory.storeJsObject(new JsInt(1))

        memory.gc(new LinkedList(scope.getAllReferences()))

        for (Memory.Reference ref : scope.getAllReferences())
            assert memory.getJsObject(ref) != null
    }

}
