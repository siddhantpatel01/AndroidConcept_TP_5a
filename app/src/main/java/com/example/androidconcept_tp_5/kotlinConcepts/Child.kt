package com.example.androidconcept_tp_5.kotlinConcepts

class Child: Parent(){
    fun m2(){
        println("Child class - m2()")
    }

    override fun m1(){
        println("Child overriden - m1()")
    }
}