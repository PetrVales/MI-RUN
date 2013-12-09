function f1() {

}

var a = f1()

function f2() {
    1 + 2
}

var b = f2()

function f3() {
    var a
    a = 1 + 5
    a
}

var c = f3()

function f4(a) {
    a + 2
}

var d = f4(1)
var e = f4(10)

function f5(a) {
    a + x
}

var x = 1

var f = f5(1)
var g = f5(10)

function f6(a) {
    function(b) {
        a + b + x
    }
}

var h = f6(5)
var i = h(10)

x = 2

var j = h(10)