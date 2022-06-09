package courseKot.kot.oop.anonimClasses

fun main() {
    val car: Transport = Car()
    val bike: Transport = Bike()
//    if (car is Car) {
//        car.name = "Car2"
//    }
    if (car !is Car) return //Smart Cast
    if(car is Car && car.startEngine()) //Smart Cast
    car.name = "Car2"
    println(car.name)
}