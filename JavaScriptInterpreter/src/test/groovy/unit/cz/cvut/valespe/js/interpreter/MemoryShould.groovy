package cz.cvut.valespe.js.interpreter

import cz.cvut.valespe.js.interpreter.model.JsObject
import cz.cvut.valespe.js.interpreter.model.ReferenceError
import org.junit.Ignore
import org.junit.Test

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.when

class MemoryShould  {

    private Memory memory = new Memory()

    @Test
    public void "store objects"() {
        def ref1 = memory.storeJsObject(mock(JsObject.class))
        def ref2 = memory.storeJsObject(mock(JsObject.class))

        assert ref1
        assert ref2
        assert 0 == ref1.address
        assert 1 == ref2.address
    }

    @Test
    public void "get objects"() {
        def ref1 = memory.storeJsObject(mock(JsObject.class))
        def ref2 = memory.storeJsObject(mock(JsObject.class))

        assert memory.getJsObject(ref1)
        assert memory.getJsObject(ref2)
    }

}
