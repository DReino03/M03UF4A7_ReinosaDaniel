
fun main() {
    var objecte : ObjecteGeometric = ObjecteGeometric(2, 3)
    objecte.setColor("Blau")
    println(objecte.toString())
    var cercle : Cercle = Cercle(2, 3, 3.0)
    println(cercle.toString())
    var rectangle : Rectangle = Rectangle(0, 1, 3.0, 6.0)
    println(rectangle.toString())
    var triangle : Triangle = Triangle(8, 5, 2.0, 4.0)
    println(triangle.toString())
    var quadrat : Quadrat = Quadrat(1, 9, 2.0, 2.0)
    println(quadrat.toString())
}
