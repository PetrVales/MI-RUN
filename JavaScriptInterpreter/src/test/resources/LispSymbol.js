function LispSymbol(value) {

    this.value = value

    this.isLispSymbol = function() {
        return true;
    }

    this.interpret = function(environment) {
        return environment.get(this);
    }

    this.toString = function() {
        return value
    }

}

LispSymbol.prototype = new LispObject();
