describe("LispEnvironment", function() {

    it("get value.", function() {
        var environment = new LispEnvironment()
        environment.put(new LispSymbol("a"), 1)

        expect(environment.get(new LispSymbol("a"))).toEqual(1)
    });

    it("raise error for unknown symbol.", function() {
        var environment = new LispEnvironment()

        try {
            environment.get(new LispSymbol("a"))
        } catch(e) {
            expect(e).toEqual("Unknown variable")
        }
    });

    it("get value from parent.", function() {
        var parent = new LispEnvironment()
        parent.put(new LispSymbol("a"), 1)
        var environment = new LispEnvironment()
        environment.setParent(parent)

        expect(environment.get(new LispSymbol("a"))).toEqual(1)
    });

});
