function LispParser(input) {

    var index = 0;

    this.parse = function() {
        this.skipWhiteSpaces()
        if (input[index] == '(') {
            return this.parseLispCons()
        } else if (this.isNumber()) {
            return this.parseLispNumber()
        } else {
            return this.parseLispSymbol()
        }
    }

    this.parseLispCons = function() {
        this.next()
        this.skipWhiteSpaces()
        var car = this.parse()
        this.skipWhiteSpaces()
        var cdr = null
        if (this.hasNext()) {
            cdr = this.parseCdr()
        }
        this.skipWhiteSpaces()
        this.next()
        this.skipWhiteSpaces()
        return new LispCons(car, cdr)
    }

    this.parseCdr = function() {
        var car = this.parse()
        this.skipWhiteSpaces()
        var cdr = null
        if (this.hasNext()) {
            cdr = this.parseCdr()
            this.skipWhiteSpaces()
        }
        return new LispCons(car, cdr)
    }

    this.parseLispSymbol = function() {
        var name = input[index]
        this.next()
        while (this.hasNext() && !this.isWhiteSpace()) {
            name = name + input[index]
            this.next()
        }
        return new LispSymbol(name)
    }

    this.parseLispNumber = function() {
        var number = parseInt(input[index])
        this.next()
        while (this.hasNext() && this.isNumber()) {
            number = number * 10 +  parseInt(input[index])
            this.next()
        }
        return new LispNumber(number)
    }

    this.skipWhiteSpaces = function() {
        while (this.isWhiteSpace())
            this.next()
    }

    this.isWhiteSpace = function() {
        return (input[index] == ' ') || (input[index] == '\t') || (input[index] == '\n')
    }

    this.isNumber = function() {
        return !isNaN(parseInt(input[index]));
    }

    this.hasNext = function() { return index < input.length && input[index] != ')' }

    this.next = function() { index = index + 1 }

}
