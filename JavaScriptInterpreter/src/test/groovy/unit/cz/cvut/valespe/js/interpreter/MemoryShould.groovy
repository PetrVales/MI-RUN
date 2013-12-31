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

    @Test(expected = ReferenceError.class)
    @Ignore
    public void "gc collect garbage"() {
        def root = mock(JsObject.class)
        def rootRef = memory.storeJsObject(root)
        def ref1 = memory.storeJsObject(mock(JsObject.class))
        def ref2 = memory.storeJsObject(mock(JsObject.class))
        def ref3 = memory.storeJsObject(mock(JsObject.class))
        when(root.getReferences()).thenReturn([ref1, ref3])

        memory.gc([rootRef])

        memory.getJsObject(ref2)
    }

    @Test
    @Ignore
    public void "gc preserve live object"() {
        def root = mock(JsObject.class)
        def rootRef = memory.storeJsObject(root)
        def ref1 = memory.storeJsObject(mock(JsObject.class))
        def ref2 = memory.storeJsObject(mock(JsObject.class))
        def ref3 = memory.storeJsObject(mock(JsObject.class))
        when(root.getReferences()).thenReturn([ref1, ref3])

        memory.gc([rootRef])

        assert memory.getJsObject(rootRef)
        assert memory.getJsObject(ref1)
        assert memory.getJsObject(ref3)
    }

}
