package com.example.androidconcept_tp_5.activity

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityDatabindingBinding
import com.example.androidconcept_tp_5.model.Student
import com.example.androidconcept_tp_5.util.Keys

class DatabindingActivity : BaseActivity() {
    private lateinit var binding: ActivityDatabindingBinding
    val TAG = "configuration_changes"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding)
//        binding.student = Student("Andy", "Rubin")
        Log.d(TAG, "onCreate: ")

        binding.btnSubmit.setOnClickListener {
//            val student = Student(binding.etFname.text.toString(), binding.etLname.text.toString())
//            binding.tvFname.text = student.fName
//            binding.tvLname.text = student.lName

            binding.student = Student(binding.etFname.text.toString(), binding.etLname.text.toString())

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(Keys.FNAME, binding.etFname.text.toString())
        outState.putString(Keys.LNAME, binding.etLname.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        binding.student = Student(savedInstanceState.getString(Keys.FNAME)!!, savedInstanceState.getString(Keys.LNAME)!!)
    }
}