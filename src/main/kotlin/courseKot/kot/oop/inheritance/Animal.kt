package courseKot.kot.oop.inheritance

open class Animal(val name: String, val weight: Float, val habitat: String) {
    open fun eat() {
        println("Eat")
    }

    fun run() {
        println("Run")
    }
}