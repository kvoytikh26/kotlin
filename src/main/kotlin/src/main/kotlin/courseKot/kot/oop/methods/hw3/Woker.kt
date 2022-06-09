package courseKot.kot.oop.methods.hw3

import java.util.Calendar

class Worker(val name: String, val position: String, val startYear: Int) {
    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Working")
    }
}

fun Worker.printInfo() {
    println("Nmae $name Position $position StartYear $startYear Exp $experience")
}

fun main() {
    var worker = Worker("Kris", "Dev", 2020)
    worker.printInfo()
}

