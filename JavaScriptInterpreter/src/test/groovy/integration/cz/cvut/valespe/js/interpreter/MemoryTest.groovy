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


    @Test
    public void "gc when out of memory"() {
        for (int x = 0; x < 1000; x++)
            memory.storeJsObject(new JsInt(1))

        def intRef = memory.storeJsObject(new JsInt(99))

        assert memory.getJsObject(intRef) != null
        assert memory.getJsObject(intRef).value() == 99
    }

}
