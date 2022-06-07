package functionalProgramming

class Lambdas2 {
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
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE))

    fun task1() {
//        val mapByAge: Map<Int, List<Hero>> =
//            heroes.groupBy { it.age }
//        val (age, group) = mapByAge.maxBy { (_, group) ->
//            group.size
//        }!!
//        println(age)
    }

    fun task2() {
        val mapByName: Map<String, Hero> =
            heroes.associateBy { it.name }
        mapByName["Frenchy"]?.age
    }

    fun task3() {
        val mapByName = heroes.associateBy { it.name }
        val unknownHero = Hero("Unknown", 0, null)
        mapByName.getOrElse("unknown") { unknownHero }.age
    }
}