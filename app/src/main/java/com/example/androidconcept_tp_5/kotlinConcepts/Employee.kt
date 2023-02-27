package com.example.androidconcept_tp_5.kotlinConcepts

class Employee(val age: String = "10") {
    var name: String = "Android Studio"
    var contactNo: String = "1234567890"
    var address: String = "Noida"

    init {

    }

    fun displayInfo() = print("Name: $name \n"+
    "ContactNo: $contactNo \n"+
    "Address: $address")
}