package com.example.androidconcept_tp_5.kotlinConcepts

fun main() {
    val red = Red("light red", 25)
    val block1: Blocks = Red("", 10)

    val block = when(block1){
        is Red ->{

        }

        is Blue ->{

        }
    }
}