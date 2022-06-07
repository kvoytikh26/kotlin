package basicStructures

class InWord {
    fun iterated() {
        for (i in 'a'..'z') {
            println(i)
        }
    }

    fun isLetter(c: Char) : Boolean {
        return c in 'a'..'z' || c in 'A'..'Z'
    }

//    fun compareStrings(s: String) : Boolean {
//        return (s in 'a'..'k') //bounds
//    }
}