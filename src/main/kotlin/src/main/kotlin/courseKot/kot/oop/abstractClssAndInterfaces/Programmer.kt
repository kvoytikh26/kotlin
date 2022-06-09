package courseKot.kot.oop.abstractClssAndInterfaces

import java.time.Clock

open class Programmer(name: String, age: Int, val language: String)
    : Worker(name, age), Cleaner {
    override fun work() {
        println("Programmer is coding in $language")
    }

    override fun clean() {
        println("Programmer is cleaning")
    }
}

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Programmer("Kristina", 21, "Js"))
    workers.add(Programmer("Oleg", 27, "Kotlin"))
    workers.add(Director("Nik", 27))

    val cleaner = workers.filter{it is Cleaner }.map{it as Cleaner}
    for (worker in cleaner) {
        worker.clean()

        //worker as Cleaner - Cast unsafe
//        worker.work()
    }
}