package courseKot.kot.oop.classes

class User {
    var age: Int = 0

    set(value) {
        if (value >= 0) {
            field = value
        }
    }

    var name: String? = null

    get() {
        return if (field == null) {
            return ""
        } else {
            field
        }
    }
}