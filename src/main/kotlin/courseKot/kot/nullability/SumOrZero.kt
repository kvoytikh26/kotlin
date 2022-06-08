package courseKot.kot.nullability

private val str1: String? = "FirstStr"
private val str2: String? = "SecondStr"
private val str3: String? = null

fun countSumOfStrings(str1: String?, str2: String?, str3: String?): Int {
    return (str1?.length ?: 0) + (str2?.length ?: 0) + (str3?.length ?: 0)
}

fun main() {
    //should be 17
    println(countSumOfStrings(str1, str2, str3))

    println("str1 length = ${str1?.length ?: 0}")
    println("str2 length = ${str2?.length ?: 0}")
}