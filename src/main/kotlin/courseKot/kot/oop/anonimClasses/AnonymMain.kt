package courseKot.kot.oop.anonimClasses

fun main() {
    travel(object : Transport ("Bus") {
        override fun drive() {
            println("Bus is driving")
        }

    })
}

fun travel(transport: Transport) {
    transport.drive()
}