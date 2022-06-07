package functionalProgramming

class ReturnFromLambda {
    fun duplicateNonZero(list: List<Int>): List<Int> {
        return list.flatMap {
            //return empty list from all function
            if (it == 0) return listOf()
            listOf(it, it)
        }
    }
//    println(duplicateNonZero(listOf(3, 0, 5))) --> []
}