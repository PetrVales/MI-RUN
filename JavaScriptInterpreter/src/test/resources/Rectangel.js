function Rectangel(width, height) {

    this.width = width
    this.height = height
    this.surface1 = function() {
        this.width * this.height
    }
    this.surface2 = function() {
        this.width * this.height
    }

}

var rectangel = new Rectangel(10, 20)
var surface1 = rectangel.surface1()
var surface2 = rectangel.surface2()