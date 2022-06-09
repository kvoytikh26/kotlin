package courseKot.kot.oop.dataClasses

data class Student(var firstName: String, var secondName: String, var id: Int) {
//    operator fun component1 = firstName;
//    operator fun component2 = secondName;
//    operator fun component3 = id;
}

fun main() {
    val student1 = Student("Ivan", "Ivanov", 412345)
    val student2 = Student("Ivan", "Ivanov", 412345)

    val student3 = student1.copy(id = 4367)
    val (name, _, id) = student1

    println(name)
//    println(lastName)
    println(id)
    println(student1)
    println(student2)
    println(student3)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2) //compare objects
    println(student1 === student2) //compare link

    println(student1 == student3) //compare objects
    println(student1 === student3) //compare link
}