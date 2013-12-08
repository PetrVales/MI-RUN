package cz.cvut.valespe.js.interpreter;

import java.util.Collections;
import java.util.List;

/**
 * Java Script inner representation of object
 */
public abstract class JsObject {

    public abstract Object value();

    public boolean isJsObject() {
        return true;
    }

    public boolean isJsFunction() {
        return false;
    }

    public boolean isJsInt() {
        return false;
    }

    public boolean isJsString() {
        return false;
    }

    public boolean isUserDefinedObject() {
        return false;
    }

    public boolean isSymbol() {
        return false;
    }

    public abstract JsObject invoke(String function, List<JsObject> args);

    public abstract JsObject invoke(List<JsObject> args);

    public List<Memory.Reference> getReferences() {
        return Collections.EMPTY_LIST; // TODO
    }

}
