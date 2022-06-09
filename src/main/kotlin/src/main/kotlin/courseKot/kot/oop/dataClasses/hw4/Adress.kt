package courseKot.kot.oop.dataClasses.hw4

data class Adress (var city: String, var street: String, var num: Int) {
}

fun main() {
    var adress = Adress("Lviv", "Shevchenko", 42);
    var adress2 = adress.copy();
    println(adress)
    println(adress2)

    println(adress.hashCode())
    println(adress2.hashCode())

    println(adress == adress2)
}