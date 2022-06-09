package courseKot.kot.oop

import courseKot.kot.oop.classes.User


fun main() {
    val user = User()
    user.age = 21
    user.name = "Kristina"

    println ("Name ${user.name}, Age ${user.age}")
}