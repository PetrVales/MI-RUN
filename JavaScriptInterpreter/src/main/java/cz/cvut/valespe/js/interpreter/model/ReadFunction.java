package cz.cvut.valespe.js.interpreter.model;

import cz.cvut.valespe.js.interpreter.Memory;
import cz.cvut.valespe.js.interpreter.Scope;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadFunction extends JsFunction {

    public ReadFunction() {
        super("read", Arrays.asList("uri"), null, null);
    }

    @Override
    public Memory.Reference invoke(List<Memory.Reference> args, Scope invokeScope, Memory memory) {
        JsObject jsObject = memory.getJsObject(args.get(0));
        if (jsObject.isSymbol()) {
            final Memory.Reference reference = invokeScope.get((String) jsObject.value());
            jsObject = memory.getJsObject(reference);
        }
        String uri = (String) jsObject.value();
        String text = loadFile(uri);
        return memory.storeJsObject(new JsString(text));
    }

    @Override
    public List<Memory.Reference> getAllReferences() {
        return Collections.emptyList();
    }

    private String loadFile(String uri) {
        final InputStream inputStream = LoadFunction.class.getResourceAsStream(uri);
        try {
            return IOUtils.toString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return "";
    }
}
