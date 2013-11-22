function LispNumber(value) {

    this.isLispNumber = function() {
        return true;
    }

    this.interpret = function(environment) {
        return value;
    }

    this.toString = function() {
        return value.toString()
    }

    this.value = value

}

LispNumber.prototype = new LispObject();
