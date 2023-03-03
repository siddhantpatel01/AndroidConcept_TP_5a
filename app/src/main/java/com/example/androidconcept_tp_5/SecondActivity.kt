package com.example.androidconcept_tp_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val fName = intent.getStringExtra("fName")
        val lName = intent.getStringExtra("lName")
        val mobNo = intent.getStringExtra("mobNo")

        Log.d("Intent_DATA", "Name - $fName $lName \nMobNo - $mobNo")
    }
}