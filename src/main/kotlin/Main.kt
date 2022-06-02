fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin";

    println("Hello, $name");

    println(max(7, 3));

    printValue("Hi, everyone!");
}

fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b;
}

//fun return Unit
fun printValue(value: String) {
    println(value);
}
