package basicStructures

class Exceptions {
    //exc can be variable of any type
    fun throwExc(number : Int) {
        val percentage =
            if (number in 0..100)
                number
        else
            throw java.lang.IllegalArgumentException("Not valid percentage value");
    }

    fun checkExc(string: String) {
        val number = try {
            Integer.parseInt(string)
        } catch (e: java.lang.NumberFormatException) {
            return
        }
    }
}