function LispCons(car, cdr) {

    this.isLispCons = function() {
        return true;
    }

    this.car = car
    this.cdr = cdr == null ? new LispNil() : cdr

    this.interpret = function(environment) {
        return environment.get(this.car).interpret(this.cdr, environment)
    }

    this.toString = function() {
        var result = "("
        result = result + this.listToString()
        result = result + ")"
        return result
    }

    this.listToString = function() {
        var result = car.toString()
        if(this.cdr.isLispCons()) {
            result = result + " " + cdr.listToString()
        }
        return result
    }

    this.isLispNil = function() {
        return (this.car == null || this.car.isLispNil()) && this.cdr.isLispNil()
    }

}

LispCons.prototype = new LispObject();
