describe("LispCons", function() {
    var lispCons;

    beforeEach(function() {
        lispCons = new LispCons();
    });

    it("is lisp object.", function() {
        expect(lispCons.isLispObject()).toBeTruthy()
    });

    it("is lisp cons.", function() {
        expect(lispCons.isLispCons()).toBeTruthy()
    });

    it("is not nil.", function() {
        expect(lispCons.isLispNil()).toBeFalsy()
    });

    it("has car part init to nil.", function() {
        expect(lispCons.car).isLispNil()
    });

    it("has cdr part init to nil.", function() {
        expect(lispCons.cdr).isLispNil()
    });

});
