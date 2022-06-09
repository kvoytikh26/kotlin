package courseKot.kot.oop.classes.hw1

class Dog {
    var name: String = ""
    get() = field.toLowerCase().capitalize()

    private var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value;
            }
        }

    var weight: Float = 0f
        set(value) {
            if (value >= 0) {
                field = value;
            }
        }

}

fun main() {
    var dog = Dog()
    dog.name = "alame"
    println("name = ${dog.name}")

    dog.weight = -11f
    println("weight ${dog.weight}")
}