package courseKot.kot.oop.inheritance

open class Dog(weight: Float) : Animal("Dog", weight, "Ground") {
    override fun eat() {
        println("Eat meet")
    }
}

fun main() {
    val dog = Dog(42f)
    println(dog.habitat)
}