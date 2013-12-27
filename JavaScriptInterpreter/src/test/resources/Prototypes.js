function A() {
    this.a = function() { 1 }
}

function B() {
    this.b = function() { 2 }
}

function C() {
    this.a = function() { 20 }
    this.c = function() { 3 }
}

B.prototype = new A()
C.prototype = new A()

var a = new A()
var b = new B()
var c = new C()

var aA = a.a()
var bA = b.a()
var bB = b.b()
var cA = c.a()
var cC = c.c()
