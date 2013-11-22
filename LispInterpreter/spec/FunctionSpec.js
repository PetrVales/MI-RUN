describe("Lambdas", function() {
    var environment;

    beforeEach(function() {
        environment = new LispEnvironment();
    });

    it("create function (defun name ()).", function() {
        var ast = new LispParser("(defun name ())").parse()
        var result = ast.interpret(environment)
        var expected = environment.get(new LispSymbol("name"))

        expect(result.isLispFunction()).toBeTruthy()
        expect(result.args.isLispCons()).toBeTruthy()
        expect(result.body.isLispNil()).toBeTruthy()
        expect(result).toBe(expected)
    });

    it("create function (defun name ()) than execute it (name) and get NIL.", function() {
        var ast = new LispParser("(defun name ())").parse()
        ast.interpret(environment)
        ast = new LispParser("(name)").parse()
        var result = ast.interpret(environment)

        expect(result.isLispNil()).toBeTruthy()
    });

    it("create function (defun name (x) x).", function() {
        var ast = new LispParser("(defun name (x) x)").parse()
        var result = ast.interpret(environment)
        var expected = environment.get(new LispSymbol("name"))

        expect(result.isLispFunction()).toBeTruthy()
        expect(result.args.isLispCons()).toBeTruthy()
        expect(result.args.car.value).toEqual("x")
        expect(result.body.car.value).toEqual("x")
        expect(result).toBe(expected)
    });

    it("create function (defun name (x) x) than execute it (name 1) and get 1.", function() {
        var ast = new LispParser("(defun name (x) x)").parse()
        ast.interpret(environment)
        ast = new LispParser("(name 1)").parse()
        var result = ast.interpret(environment)

        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret()).toBe(1)
    });

    it("create function (defun plus (x y) (+ x y)) than execute it (plus 1 2) and get 3.", function() {
        var ast = new LispParser("(defun plus (x y) (+ x y))").parse()
        ast.interpret(environment)
        ast = new LispParser("(plus 1 2)").parse()
        var result = ast.interpret(environment)

        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret()).toBe(3)
    });

    it("raise error for invalid number of arrguments.", function() {
        var ast = new LispParser("(defun name (x y) x)").parse()
        ast.interpret(environment)
        ast = new LispParser("(name 1)").parse()

        try {
            ast.interpret(environment)
        } catch(e) {
            expect(e).toEqual("Invalid number of arguments")
        }
    });

})

//|rslt env|
//
//env := SchemeEnvironment new.
//    env initializeBuiltinFunctions.
//    env define:(SchemeSymbol characters:'a')
//value:(SchemeInteger new value:19).
//
//"/ ------------------
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define l4 (lambda (a b) (+ a b)))' in:env.
//
//    rslt := SchemeEvaluator new
//    evaluateString:'(l4 a 250)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 269).
//
//"/ ------------------
//
//rslt := SchemeEvaluator new
//    evaluateString:'(lambda () true)' in:env.
//    self assert:(rslt isSchemeUserDefinedFunction).
//
//"/ ------------------
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define l1 (lambda () true))' in:env.
//
//    rslt := SchemeEvaluator new
//    evaluateString:'(l1)' in:env.
//    self assert:(rslt isSchemeTrue).
//
//"/ ------------------
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define l2 (lambda () a))' in:env.
//
//    rslt := SchemeEvaluator new
//    evaluateString:'(l2)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 19).
//
//"/ ------------------
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define l3 (lambda (a) a))' in:env.
//
//    rslt := SchemeEvaluator new
//    evaluateString:'(l3 19999)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 19999).
//
//"/ ------------------
//
//rslt := SchemeEvaluator new
//    evaluateString:'(eq? a 19)' in:env.
//    self assert:(rslt isSchemeTrue).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(eq? a 18)' in:env.
//    self assert:(rslt isSchemeFalse).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(eq? 0 0)' in:env.
//    self assert:(rslt isSchemeTrue).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define xx (lambda (a b)
//    (if (eq? a 1) b 99)))' in:env.
//rslt := SchemeEvaluator new
//    evaluateString:'(xx 1 10)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 10).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define * (lambda (a b)
//    (if (eq? a 1)
//    b
//999)))' in:env.
//rslt := SchemeEvaluator new
//    evaluateString:'(* 1 10)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 10).
//rslt := SchemeEvaluator new
//    evaluateString:'(* 2 10)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 999).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define * (lambda (a b)
//    (if (eq? a 1)
//    b
//    (+ b (* (- a 1) b)))))' in:env.
//
//"/    rslt := SchemeEvaluator new
//"/                evaluateString:'(* 1 10)' in:env.
//"/    self assert:(rslt isSchemeInteger).
//"/    self assert:(rslt value = 10).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(* 2 10)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 20).
//
//rslt := SchemeEvaluator new
//    evaluateString:'(define fac (lambda (n)
//    (if (eq? n 1) 1
//    (* n (fac (- n 1))))))' in:env.
//
//rslt := SchemeEvaluator new
//    evaluateString:'(fac 10)' in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 3628800 ).
//!
