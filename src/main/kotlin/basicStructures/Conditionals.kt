package basicStructures
class Conditionals {
    enum class Color {
        BLUE, ORANGE, RED
      }
    //no ternar operator
    fun findMax(a : Int, b : Int) : Int {
        return if (a > b) a else b;
    }
    fun chooseColor(color : Color) {
        when (color) {
            Color.BLUE, Color.ORANGE    -> println("cold")
            else -> println("hot")
        }
    }

    fun mix(c1: Color, c2: Color) : Color =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.ORANGE) -> Color.ORANGE
            setOf(Color.BLUE, Color.ORANGE) -> Color.RED
            else -> throw Exception("Dirty color")
        }
}