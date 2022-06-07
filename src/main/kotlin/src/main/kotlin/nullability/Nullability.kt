package nullability

class Nullability {
    val s1: String = "always not null"
    val s2: String? = null

    fun task1() {
        val a: Int? = null
        val b: Int? = 1
        val c: Int = 2

        val s1 = (a ?: 0) + c
        val s2 = (b ?: 0) + c
        print("$s1$s2")
    }

    fun task2() {
//        #1 fun isFoo1(n: Name) = n.value == "foo"
//        #2 fun isFoo2(n: Name?) = n.value == "foo"
//        #3 fun isFoo3(n: Name?) = n != null && n.value == "foo"
//        #4 fun isFoo4(n: Name?) = n?.value == "foo"
//
//        fun main(args: Array<String>) {
//            #5   isFoo1(null)
//            #6   isFoo2(null)
//            #7   isFoo3(null)
//            #8   isFoo4(null)
//        }
    }

    fun task3() {
        val x: Int? = 1
        val y: Int = 2
        val sum = x ?: 0 + y
        println(sum)
    }


    fun foo(list1: List<Int?>, list2: List<Int>?) {
        list1.size
        list2?.size

        val i: Int? = list1.get(0)
        val j: Int? = list2?.get(0)
    }

    fun isEorRNull(args: Array<String>) {
        fun String?.isEmptyOrNull() = this == null || this.isEmpty()

        val s1: String? = null
        val s2: String? = ""
//        s1.isEmptyOrNull() eq true
//        s2.isEmptyOrNull() equ true

        val s3 = "   "
//        s3.isEmptyOrNull() eq false
    }

    fun safeCast() {
        val s = "abc"
        println(s as? Int)    // null
        println(s as Int?)    // exception
    }
}