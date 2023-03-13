package com.example.androidconcept_tp_5.model

import java.io.Serializable

data class User(
    var fName: String = "",
    var lName: String = "",
    var mobNo: String = ""
): Serializable
