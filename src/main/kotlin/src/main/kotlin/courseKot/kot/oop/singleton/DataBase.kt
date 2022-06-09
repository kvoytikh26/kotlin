package courseKot.kot.oop.singleton

class DataBase private constructor(){
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
    companion object {
        var db: DataBase? = null
        fun getInstance(): DataBase {
            db?.let {
                return it
            }
            val instance = DataBase()
            db = instance
            return instance
        }
    }
}

object Singleton {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }

}

fun main() {
    val db = DataBase.getInstance()
    db.insertData("1")
    db.insertData("2")

    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")

    for (str in db.data) {
        println(str)
    }

    println("Kotlin Singleton")

    val singleTonKotlin = Singleton
    singleTonKotlin.insertData("1")
    singleTonKotlin.insertData("2")

    val testSinlTest = SinlTest
    testSinlTest.insertTestData("3")
    testSinlTest.insertTestData("4")

    for (str in singleTonKotlin.data) {
        println(str)
    }

}