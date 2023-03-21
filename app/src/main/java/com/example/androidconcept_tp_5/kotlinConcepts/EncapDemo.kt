package com.example.androidconcept_tp_5.kotlinConcepts

class EncapDemo {
//    private var name: String = "Android"
//
//
//    fun setName(input: String){
//        this.name = input
//    }
//
//    fun getName(): String{
//        return name
//    }


//    var name: String = "Initial value"
//        private set


    val name: String by lazy {
        return@lazy "I am lazy"
    }


}