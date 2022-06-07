package functionalProgramming

import java.util.StringJoiner

class Lambdas {
    data class Hero(
        val name: String,
        val age: Int,
        val gender: Gender?
    )
    enum class Gender {MALE, FEMALE}

    val heroes = listOf<Hero>(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady", 29, Gender.FEMALE)
    )

    fun findLastEl() : String {
        return  heroes.last().name //if null -> NoSuchElExc
    }

    fun findLastElOrNull() : String? {
        return  heroes.lastOrNull { it.age == 30 }?.name
    }

    fun findDistinctEl() : Int {
        return heroes.map {it.age}.distinct().size;
    }

    fun getdOldestSize () : Int {
        val (youngest, oldest) = heroes.partition { it.age > 30 }
        return oldest.size;
    }

    fun getMaxByAge() {
//        return heroes.maxBy{ it.age }?.name
    }
}