
open class Rectangle : ObjecteGeometric {
    @JvmField protected var base : Double
    @JvmField protected var altura : Double
    init {
        base = 1.0
        altura = 2.0
    }
    constructor(x : Int, y : Int, base : Double, alçada: Double) : super(x, y) {
        this.base = base
        this.altura = alçada
    }

    override fun toString(): String {
        return "Rectangle(base=$base, altura=$altura) ${super.toString()}"
    }

    open fun perimetre(): Double {
        return 2 * base + 2 * altura
    }

    open fun area(): Double {
        return base * altura
    }
}