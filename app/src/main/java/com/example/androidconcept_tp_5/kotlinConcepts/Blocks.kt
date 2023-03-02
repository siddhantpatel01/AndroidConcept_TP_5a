package com.example.androidconcept_tp_5.kotlinConcepts

sealed class Blocks
open class Red(val colorStatus: String, val colorCode: Int) : Blocks()
class Blue(val colorCode: Int) : Blocks()
