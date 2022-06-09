package courseKot.kot.oop.singleton

class Test {
    fun insertTestData(string: String) {
        DataBase.getInstance().insertData(string)
    }
}

object SinlTest {
    fun insertTestData(string: String) {
        Singleton.insertData(string)
    }
}