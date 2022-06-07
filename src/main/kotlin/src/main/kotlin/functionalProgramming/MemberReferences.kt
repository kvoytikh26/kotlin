package functionalProgramming

class MemberReferences {
    //bound
    class Person(val name: String, val age: Int) {
        fun isOlder(ageLimit: Int) = age > ageLimit
    }
    val alice = Person("Alice", 29)
    val agePredicate = alice::isOlder

//    agePredicate(21)

    //unbound
    fun isEven(i: Int): Boolean = i % 2 == 0

    val list = listOf(1, 2, 3, 4)
//    list.any(::isEven)
}