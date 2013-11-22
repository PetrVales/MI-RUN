describe("LispSymbol", function() {
    var lispSymbol;
    var VALUE = "a";

    beforeEach(function() {
        lispSymbol = new LispSymbol(VALUE);
    });

    it("is lisp symbol.", function() {
        expect(lispSymbol.isLispSymbol()).toBeTruthy()
    });

    it("has value", function() {
        expect(lispSymbol.value).toEqual(VALUE);
    });

});
