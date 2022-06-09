package courseKot.kot.oop.anonimClasses

//override field --- make open
class Car(override var name: String = "Car"): Transport(name) {

    override fun drive() {
        println("Car is driving")
    }

    fun startEngine(): Boolean {
        println("Start engine")
        return false
    }
}