package com.example.androidconcept_tp_5.kotlinConcepts

//open class FunctionDemo{
//    var i: Int = 10
//    private set
//    get
//}

class FunctionDemo(var firstName: String){

    init {
        firstName = "Android"
    }

    constructor(name: String, add: String): this(name){

    }

    fun m1(){
        val lastName = "Studio"

        println("My name is $firstName $lastName")
    }
}