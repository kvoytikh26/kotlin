package courseKot.kot.oop.enumClasses

import courseKot.kot.oop.enumClasses.Month.*
import courseKot.kot.oop.enumClasses.Seasons.*

fun main() {
    val month = JUNUARY
    val season = when (month) {
        DECEMBER, JUNUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULE, AVGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUM
    }
    println(season)
    println(month.tempAvg)
}