package extensions

class Child: Parent() {
    override fun foo() = "member child"
}
fun Parent.foo() = "parent"
fun Child.foo() = "child "

