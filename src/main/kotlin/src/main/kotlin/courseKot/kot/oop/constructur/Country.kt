package courseKot.kot.oop.constructur


//fields can be val = final from Java
class Country(var name: String, var population: Int) {

    constructor(): this("", 0)
}

fun main() {
    val ukraine = Country("Ukraine", 123454565)
    println(ukraine.name)

    ukraine.population = 456678798
    println(ukraine.population)

    val country = Country()
    println(country.name)
}