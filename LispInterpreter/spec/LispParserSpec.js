describe("LispParser", function() {

    it("parses lisp symbol aaa.", function() {
        var ast = new LispParser("aaa").parse()
        expect(ast.isLispSymbol()).toBeTruthy()
        expect(ast.value).toEqual("aaa")
        expect(ast.toString()).toEqual("aaa")
    });

    it("parses lisp number 1.", function() {
        var ast = new LispParser("1").parse()
        expect(ast.isLispNumber()).toBeTruthy()
        expect(ast.interpret()).toEqual(1)
        expect(ast.toString()).toEqual("1")
    });

    it("omits white spaces.", function() {
        var ast = new LispParser(" \t  aaa  \n").parse()
        expect(ast.isLispSymbol()).toBeTruthy()
        expect(ast.value).toEqual("aaa")
        expect(ast.toString()).toEqual("aaa")
    });

    it("parses lisp cons (a b).", function() {
        var ast = new LispParser("(a b)").parse()
        expect(ast.toString()).toEqual("(a b)")
        expect(ast.isLispCons()).toBeTruthy()
        expect(ast.car.isLispSymbol()).toBeTruthy()
        expect(ast.cdr.isLispCons()).toBeTruthy()
        expect(ast.cdr.car.isLispSymbol()).toBeTruthy()
        expect(ast.car.value).toEqual("a")
        expect(ast.cdr.car.value).toEqual("b")
        expect(ast.cdr.cdr.isLispNil()).toBeTruthy()
    });

    it("parses lisp cons with white spaces.", function() {
        var ast = new LispParser("   \n(a   b  ) \t").parse()
        expect(ast.toString()).toEqual("(a b)")
        expect(ast.isLispCons()).toBeTruthy()
        expect(ast.car.isLispSymbol()).toBeTruthy()
        expect(ast.cdr.isLispCons()).toBeTruthy()
        expect(ast.cdr.car.isLispSymbol()).toBeTruthy()
        expect(ast.car.value).toEqual("a")
        expect(ast.cdr.car.value).toEqual("b")
        expect(ast.cdr.cdr.isLispNil()).toBeTruthy()
    });


    it("parses lisp cons (a).", function() {
        var ast = new LispParser("(a)").parse()
        expect(ast.toString()).toEqual("(a)")
        expect(ast.isLispCons()).toBeTruthy()
        expect(ast.car.isLispSymbol()).toBeTruthy()
        expect(ast.car.value).toEqual("a")
        expect(ast.cdr.isLispNil()).toBeTruthy()
    });

    it("parses lisp cons   (  a  )   .", function() {
        var ast = new LispParser("   (\ta\n)  ").parse()
        expect(ast.toString()).toEqual("(a)")
        expect(ast.isLispCons()).toBeTruthy()
        expect(ast.car.isLispSymbol()).toBeTruthy()
        expect(ast.car.value).toEqual("a")
        expect(ast.cdr.isLispNil()).toBeTruthy()
    });

    it("parses lisp cons ((1 2 3) (a b)).", function() {
        var ast = new LispParser("((1 2 3) (a b))").parse()
        expect(ast.toString()).toEqual("((1 2 3) (a b))")
        expect(ast.isLispCons()).toBeTruthy()
        expect(ast.car.isLispCons()).toBeTruthy()
        expect(ast.car.car.interpret()).toEqual(1)
        expect(ast.car.cdr.car.interpret()).toEqual(2)
        expect(ast.car.cdr.cdr.car.interpret()).toEqual(3)

        expect(ast.cdr.isLispCons()).toBeTruthy()
        expect(ast.cdr.car.car.value).toEqual("a")
        expect(ast.cdr.car.cdr.car.value).toEqual("b")
    });

});
