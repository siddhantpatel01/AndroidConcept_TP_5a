package com.example.androidconcept_tp_5.kotlinConcepts

enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);


    fun printDay(number: Int){
        println("The day is $this")
    }
}