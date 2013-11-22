beforeEach(function() {
  this.addMatchers({
      isLispNil: function() {
          return this.actual.isList() && this.actual.isNil();
      }
  });
});
