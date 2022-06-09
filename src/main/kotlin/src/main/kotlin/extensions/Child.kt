package extensions

class Child: Parent() {
}
fun Parent.foo() = "parent"
fun Child.foo() = "child "

