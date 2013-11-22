function LispNil() {

    this.isLispNil = function() {
        return true;
    }

}

LispNil.prototype = new LispObject();
