package courseKot.kot.oop.constructur.hw2

class Book(val name: String, var publishYear: Int? = null, var price: Int? = null)

fun main() {
    val book = Book("Name")
    println(book.price)
}