package courseKot.kot.conditionals

fun main() {
    val a = 50;
    if (a < 40) {
        println("less 40")
    } else {
        println("more 40")
    }

    println(changeProduct(350))
    println(changeProductForAnyType(130))
}

fun changeProduct(count: Int): String {
    return if (count > 500) {
        "Pizza"
    } else if (count > 200) {
        "Meat"
    } else {
        "Mivina"
    }
}

fun changeProductForAnyType(count: Int): Any? {
    return if (count > 500) {
        "Pizza"
    } else if (count > 200) {
        500
    } else {
        null
    }
}