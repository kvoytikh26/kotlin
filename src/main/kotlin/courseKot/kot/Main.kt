package courseKot.kot

private var nullableStr: String? = null

fun main() {
        //variables
        val name = "Kristina" //=final
        var age: Int = 25
        //name = 25; -- exception
        //name = "Max"
        val city = "Lviv"
        println("$name = $age")

        //nullability
        val lengthV = name?.length ?: 0
        println(lengthV)
        println(nullableStr!!.length)
}
