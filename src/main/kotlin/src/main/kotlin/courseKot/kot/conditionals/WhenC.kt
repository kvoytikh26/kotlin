package courseKot.kot.conditionals

import java.util.StringJoiner
import java.util.StringTokenizer

fun main() {
    val nameOfMonth = "Январь"
    val season = when (nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> "Зима"
        "Март", "Апрель", "Май" -> "Весна"
        "Июнь", "Июль", "Август" -> "Лето"
        "Сентябрь", "Октябрь", "Ноябрь" -> "Осень"
        else -> "Сезон не найден"
    }
    println(season)

    println(findSeasonByIndex(4))
}

fun findSeasonByIndex(index: Int) : String {
    return when (index) {
        12, 1, 3 -> "Зима"
        in 4..5 -> "Весна"
        in 6..8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Сезон не найден"
    }
}

fun tempValue(temp: Int): String {
//    val v: Int = 30
//    return when(temp) {
//        temp  v -> "Твердое"
//        temp < 100 -> "Жидкое"
//        else -> "Газообразное"
//    }
    return ""
}