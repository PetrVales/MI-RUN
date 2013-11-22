describe("LispNumber", function() {
    var lispNumber;
    var VALUE = 5;

    beforeEach(function() {
        lispNumber = new LispNumber(VALUE);
    });

    it("is lisp number.", function() {
        expect(lispNumber.isLispNumber()).toBeTruthy()
    });

    it("returns its number value when interpreted", function() {
        expect(lispNumber.interpret()).toBe(VALUE)
    })

});
