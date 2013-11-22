function LispFunction(args, body) {

    this.args = args
    this.body = body

    this.isLispFunction = function() {
        return true;
    }

    this.interpret = function(callArgs, environment) {
        return this.evaluateBody(this.createFunctionEnvironment(environment, callArgs))
    }

    this.toString = function() {
        throw "TODO"
    }

    this.createFunctionEnvironment = function(parent, callArgs) {
        var functionEnvironment = new LispEnvironment();
        functionEnvironment.setParent(parent)
        var attributes = this.args
        var values = callArgs
        while (!attributes.isLispNil() && !values.isLispNil()) {
            functionEnvironment.put(attributes.car, values.car)
            attributes = attributes.cdr
            values = values.cdr
        }
        if (!attributes.isLispNil() || !values.isLispNil())
            throw "Invalid number of arguments"
        return functionEnvironment
    }

    this.evaluateBody = function(functionEnvironment) {
        var code = this.body
        var result = new LispNil()
        while(code.isLispCons()) {
            result = code.car.interpret(functionEnvironment)
            code = code.cdr
        }
        return result
    }

}

LispFunction.prototype = new LispObject();

