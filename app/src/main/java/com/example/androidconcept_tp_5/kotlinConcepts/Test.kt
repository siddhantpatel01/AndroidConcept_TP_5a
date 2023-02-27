package com.example.androidconcept_tp_5.kotlinConcepts

fun main() {
//    var student = Student("Android", "Studio", "Dev")
    var student = Student()
    var student1 = Student()
    student.firstName = "Android"
    student.lastName = "Studio"
    student.deptName = "Development"
    student1 = student.copy()
    println(student)
    println(student.toString())
    println(student.hashCode())
    println(student1.hashCode())



}