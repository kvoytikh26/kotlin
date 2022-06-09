package courseKot.kot.oop.methods

import java.util.StringJoiner

class Cat(val name: String, val age: Int, val weight: Float = 0f) {
    var isOld: Boolean = age >= 12

    fun printInfo() {
        println("Name $name Age $age Weight $weight")
    }

//    fun isOld() = age >= 12
}

//function, поэтому лучше создать переменнную и присвоить
//fun Cat.isOld() = age >= 12

fun main() {
    var cat = Cat("Barsik", 5, 3f)
    cat.printInfo()
    println(cat.isOld)
}