function A() {

    this.w = 1
    this.x = 2
    this.y = function() {
        3
    }
    this.z = function(x) {
        x
    }

}

var a = new A()
var w = a.w
var x = a.x
var y = a.y()
var z = a.z(4)
