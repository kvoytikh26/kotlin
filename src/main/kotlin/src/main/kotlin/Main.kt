import extensions.Child
import extensions.Parent
import extensions.foo

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin";

    println("Hello, $name");

    println(max(7, 3));

    printValue("Hi, everyone!");

    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6

    val parent:Parent = Child()
    println(parent.foo())
}

fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b;
}

//fun return Unit
fun printValue(value: String) {
    println(value);
}
