function LispEnvironment() {

    var parentEnvironment = null

    var environment = []
    environment["+"] = new Plus()
    environment["-"] = new Minus()
    environment["quote"] = new Quote()
    environment["defun"] = new Defun()

    this.put = function(symbol, value) {
        environment[symbol.value] = value
    }

    this.get = function(symbol) {
        if (symbol.value in environment)
            return environment[symbol.value]
        if (parentEnvironment == null)
            throw "Unknown variable"
        else
            return parentEnvironment.get(symbol)
    }

    this.setParent = function(parent) {
        parentEnvironment = parent
    }

}

var Plus = function() {
    this.interpret = function(cons, environment) {
        var sum = 0
        while (cons.isLispCons()) {
            var value = cons.car.interpret(environment)
            while (value instanceof LispObject)
                value = value.interpret(environment)
            sum = sum + value
            cons = cons.cdr
        }
        return new LispNumber(sum)
    }
}

var Minus = function() {
    this.interpret = function(cons, environment) {
        var value = cons.car.interpret(environment)
        while (value instanceof LispObject)
            value = value.interpret(environment)
        if (cons.cdr.isLispNil())
            return new LispNumber(-value)
        var rest = environment.get(new LispSymbol("+")).interpret(cons.cdr, environment)
        while (rest instanceof LispObject)
            rest = rest.interpret(environment)
        return new LispNumber(value - rest)
    }
}

var Quote = function() {
    this.interpret = function(cons, environment) {
        return cons
    }
}

var Defun = function() {
    this.interpret = function(cons, environment) {
        var lispFunction = new LispFunction(cons.cdr.car, cons.cdr.cdr)
        environment.put(cons.car, lispFunction)
        return lispFunction
    }
}
