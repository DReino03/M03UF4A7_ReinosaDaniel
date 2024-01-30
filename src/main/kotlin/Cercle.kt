
class Cercle : ObjecteGeometric {
    protected var radi : Double

    constructor(x : Int, y : Int, radi : Double) : super(x, y) {
        this.radi = radi
    }


    fun perimetre(): Double {
        return 2 * Math.PI * radi
    }

    fun area(): Double {
        return Math.PI * Math.pow(radi, 2.0)
    }

    override fun toString(): String {
        return "Cercle(radi=$radi) ${super.toString()}"
    }
}