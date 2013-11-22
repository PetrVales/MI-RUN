describe("Interpretation", function() {
    var environment;

    beforeEach(function() {
        environment = new LispEnvironment();
    });

    it("interpret 123 number.", function() {
        var ast = new LispParser("123").parse()
        expect(ast.interpret(environment)).toEqual(123)
    });

    it("interpret variable.", function() {
        environment.put(new LispSymbol("a"), new LispNumber(999))

        var ast = new LispParser("a").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(999)
    });

    it("evaluates (+ 1).", function() {
        var ast = new LispParser("(+ 1)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(1)
    });

    it("evaluates (+ 1 2 20).", function() {
        var ast = new LispParser("(+ 1 2 20)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(23)
    });

    it("evaluates (+ (+ 1 10) 2).", function() {
        var ast = new LispParser("(+ (+ 1 10) 2)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(13)
    });

    it("evaluates (+ a 1).", function() {
        environment.put(new LispSymbol("a"), new LispNumber(999))

        var ast = new LispParser("(+ a 1)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(1000)
    });

    it("evaluates (- 10).", function() {
        var ast = new LispParser("(- 10)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(-10)
    });

    it("evaluates (- 10 2).", function() {
        var ast = new LispParser("(- 10 2)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(8)
    });

    it("evaluates (- 10 (+ 2 1)).", function() {
        var ast = new LispParser("(- 10 (+ 2 1))").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(7)
    });

    it("evaluates (- (+ 2 1)).", function() {
        var ast = new LispParser("(- (+ 2 1))").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(-3)
    });

    it("evaluates (- a 1).", function() {
        environment.put(new LispSymbol("a"), new LispNumber(1000))

        var ast = new LispParser("(- a 1)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispNumber()).toBeTruthy()
        expect(result.interpret(environment)).toEqual(999)
    });

    it("evaluates (quote a b c).", function() {
        var ast = new LispParser("(quote a b c)").parse()
        var result = ast.interpret(environment)
        expect(result.isLispCons()).toBeTruthy()
        expect(result.car.value).toEqual("a")
        expect(result.cdr.car.value).toEqual("b")
        expect(result.cdr.cdr.car.value).toEqual("c")
    });


});


//test_04_evaluation
//|expr rslt env|
//
//env := SchemeEnvironment new.
//    env initializeBuiltinFunctions.
//    env define:(SchemeSymbol characters:'a') value:(SchemeInteger new value:19).
//
//expr := SchemeReader readFrom:'true'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeTrue).
//
//expr := SchemeReader readFrom:'(define 10 20)'.
//    self should:[
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//] raise:Error.
//
//    expr := SchemeReader readFrom:'(define b 1000)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    expr := SchemeReader readFrom:'b'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 1000).
//
//expr := SchemeReader readFrom:'(define b 10)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    expr := SchemeReader readFrom:'b'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 10).
//
//expr := SchemeReader readFrom:'(define c (+ a 10) )'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//
//    expr := SchemeReader readFrom:'(+ b 1)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 11).
//
//expr := SchemeReader readFrom:'(first (cons 1 2))'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 1).
//
//"/    expr := SchemeReader readFrom:'(define myWin (createWindow))'.
//"/    rslt := SchemeEvaluator new evaluate:expr in:env.
//"/
//"/    expr := SchemeReader readFrom:'(drawCircle myWin)'.
//"/    rslt := SchemeEvaluator new evaluate:expr in:env.
//
//expr := SchemeReader readFrom:'(quote a)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeSymbol).
//
//expr := SchemeReader readFrom:'(quote (+ 1 2))'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeCons).
//self assert:(rslt first isSchemeSymbol).
//
//
//expr := SchemeReader readFrom:'(define prog (quote (+ 1 2)))'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//
//    expr := SchemeReader readFrom:'(eval prog)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 3).
//
//expr := SchemeReader readFrom:'(define prog2 (cons ''+ (cons 100 (cons 200 ''() ))))'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    expr := SchemeReader readFrom:'(eval prog2)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 300).
//
//expr := SchemeReader readFrom:'(define v true)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    expr := SchemeReader readFrom:'(if v 123 345)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 123).
//
//rslt := SchemeEvaluator new evaluateString:'(define v true)' in:env.
//    rslt := SchemeEvaluator new evaluateString:'(define a 10000)' in:env.
//
//    expr := SchemeReader readFrom:'(define b 20000)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//
//    expr := SchemeReader readFrom:'(if v a b)'.
//    rslt := SchemeEvaluator new evaluate:expr in:env.
//    self assert:(rslt isSchemeInteger).
//self assert:(rslt value = 10000).
//!
