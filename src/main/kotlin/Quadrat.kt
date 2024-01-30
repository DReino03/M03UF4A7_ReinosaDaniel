
class Quadrat : Rectangle {
    constructor(x : Int, y : Int, base : Double, altura: Double) : super(x, y, base, altura) {
        this.base = base
        this.altura = altura
    }

    override fun perimetre(): Double {
        return 4 * base
    }

    override fun area(): Double {
        return base * base
    }
    override fun toString(): String {
        return "Quadrat(base=$base, altura=$altura) ${super.toString()}"
    }


}