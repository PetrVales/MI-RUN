package cz.cvut.valespe.js.interpreter;

import java.util.Map;

/**
 * Variable scope. Everything gets defined in one globally shared namespace.
 *
 * Each time a variable is referenced, JavaScript will traverse upwards through all the scopes until it finds it.
 * In the case that it reaches the global scope and still has not found the requested name, it will raise a ReferenceError.
 *
 * Name Resolution Order

 All scopes in JavaScript, including the global scope, have the special name this, defined in them, which refers to the current object.

 Function scopes also have the name arguments, defined in them, which contains the arguments that were passed to the function.

 For example, when trying to access a variable named foo inside the scope of a function, JavaScript will look up the name in the following order:

 In case there is a var foo statement in the current scope, use that.
 If one of the function parameters is named foo, use that.
 If the function itself is called foo, use that.
 Go to the next outer scope, and start with #1 again.
 */
public class Scope {

    private Map<String, Object> scope;

    public void define(String name) {
        scope.put(name, null);
    }

    public void set(String name, Object value) {
        if (scope.containsKey(name))
            scope.put(name, value);
    }

    public Object get(String name) {
        if (scope.containsKey(name))
            return scope.get(name);
        else
            return null;
    }

}
