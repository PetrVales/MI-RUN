function LispObject() {

    this.isLispCons = function() {
        return false;
    }

    this.isLispNumber = function() {
        return false;
    }

    this.isLispSymbol = function() {
        return false;
    }

    this.isLispNil = function() {
        return false;
    }

    this.isLispObject = function() {
        return true;
    }

    this.isLispFunction = function() {
        return false;
    }

}