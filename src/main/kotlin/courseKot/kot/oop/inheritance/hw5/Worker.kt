package courseKot.kot.oop.inheritance.hw5

open class Worker(val name: String, val age: Int) {
    open fun work() {
        println("Work")
    }
}