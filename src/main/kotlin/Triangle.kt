import kotlin.math.pow
import kotlin.math.sqrt
class Triangle : ObjecteGeometric {
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

     fun perimetre(): Double {
        return base + altura + sqrt(base.pow(2) + altura.pow(2))
    }

    fun area(): Double {
        return base * altura / 2
    }

    override fun toString(): String {
        return "Triangle(base=$base, altura=$altura) ${super.toString()}"
    }

}