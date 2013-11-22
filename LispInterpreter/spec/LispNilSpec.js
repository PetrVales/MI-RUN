describe("LispNil", function() {
    var lispNil;

    beforeEach(function() {
        lispNil = new LispNil();
    });

    it("is lisp nil.", function() {
        expect(lispNil.isLispNil()).toBeTruthy()
    });

});
