package basicStructures

class Loop {
    //for
    //while
    //do while

    fun loopsExp() {
        //for
        val list = listOf("a", "b", "c")
        // can be for (s: String in list)
        for (s in list) {
            print(s)
        }

        val map = mapOf(1 to "one",
                        2 to "two")
        for ((key, value) in map) {
            println("$key = $value")
        }

        //go by index
        for ((index, element) in list.withIndex()){
            println("$index : $element")
        }

        //iterating over range including upper bound
        for(i in 1..9) {
            print(i)
        }

        //iterating over range exclude upper bound
        for (i in 1 until 9) {
            print(i);
        }
        //когда мы добавляем число символу, он увеличивает ASCI code
        for (ch in "abc") {
            print(ch + 1); // => bcd
        }
    }
}