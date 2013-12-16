function SimpleObject1() {

    this.a = 1

}

function SimpleObject2() {

    this.a = 1
    this.b = this.a + 2

}

function SimpleObject3() {

    this.a = 1
    this.b = function() {
        3
    }
    this.c = this.a + this.b()

}

var x = new SimpleObject1()
var y = new SimpleObject2()
var z = new SimpleObject3()