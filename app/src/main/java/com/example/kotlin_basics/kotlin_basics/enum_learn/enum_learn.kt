package com.example.kotlin_basics.kotlin_basics.enum_learn

fun main() {
    var days = Day.SUNDAY

    var message = when(days.number)
    {
        1 -> "Sunday"
        2 -> "Monday"
        else -> "some other day"
    }

    println(message)

    for (i in Day.entries)
    {
        println(i)
    }
}

enum class Day(val number :Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
}