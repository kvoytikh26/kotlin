package conditionals

class IfvsWhenCondition {
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
}