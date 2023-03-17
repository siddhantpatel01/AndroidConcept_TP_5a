package com.example.androidconcept_tp_5.kotlinConcepts

fun main() {
//    val nums = arrayOf(10, 20, 30, 40)
//    val numbers = arrayOf<String>("A", "B", "V")
//
//    nums[0] = 100
////    println(nums[2])
//
//    for (i in nums.indices){
//        println(nums[i])
//    }

//    val array = IntArray(5, {it * 1})
//    for (i in array.indices){
//        println(i)
//    }

    val array = arrayOfNulls<Int>(5)

    for (i in array.indices){
        println(array[i])
    }


}