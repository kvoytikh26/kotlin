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

    fun duplicateNonRightLogic(list: List<Int>): List<Int> {
        return list.flatMap l@{
            //return empty list from lambda
            if (it == 0) return@l listOf()
            listOf(it, it)
        }
    }

    fun localFunction(list: List<Int>) : List<Int> {
        fun duplicateNonZeroElement(e: Int): List<Int> {
            if (e == 0) return listOf()
            return listOf(e, e)
        }
        return list.flatMap(::duplicateNonZeroElement)
    }

    fun anonymousFunction(list: List<Int>) : List<Int>{
        return list.flatMap(fun (e): List<Int> {
            if (e == 0) return listOf();
            return listOf(e, e);
        })
    }

    fun avoidIncideReturning(list: List<Int>) : List<Int> {
        return list.flatMap {
            if (it == 0) listOf()
            else listOf(it, it)
        }
    }
}