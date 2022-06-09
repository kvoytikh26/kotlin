package courseKot.kot.oop.inheritance.hw5

open class Programmer(name: String, age: Int, val language: String): Worker(name, age) {
    override fun work() {
        println("Programmer")
    }
}

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Worker("Kristina", 21))
    workers.add(Programmer("Oleg", 27, "Kotlin"))

    for (worker in workers) {
        worker.work()
    }
}