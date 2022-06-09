package courseKot.kot.oop.abstractClssAndInterfaces

open class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Director is working")
    }
}