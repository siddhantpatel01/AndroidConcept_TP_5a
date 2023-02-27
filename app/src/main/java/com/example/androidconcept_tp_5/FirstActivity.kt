package com.example.androidconcept_tp_5

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidconcept_tp_5.databinding.ActivityFirstBinding
import kotlin.math.log

class FirstActivity: AppCompatActivity(), OnClickListener {
    val TAG: String = "FirstActivity"
//    private lateinit var btnClick: Button
//    private lateinit var btnSubmit: Button
//    private lateinit var btnLogin: Button

//    private lateinit var textDisplay: TextView
//    private lateinit var etInput: EditText
    private lateinit var context: Context

    lateinit var binding: ActivityFirstBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate()")

//        btnClick = findViewById(R.id.btn_click)
//        btnSubmit = findViewById(R.id.btn_submit)
//        btnLogin = findViewById(R.id.btn_login)
//
//        textDisplay = findViewById(R.id.tv_display)
//        etInput = findViewById(R.id.et_input)
//
//        context = this@FirstActivity

//        btnClick.setOnClickListener(object: OnClickListener{
//            override fun onClick(p0: View?) {
//                TODO("Not yet implemented")
//            }
//
//        })
//
//        btnSubmit.setOnClickListener(object: OnClickListener{
//            override fun onClick(p0: View?) {
//                TODO("Not yet implemented")
//            }
//
//        })
//
//        btnLogin.setOnClickListener(object: OnClickListener{
//            override fun onClick(p0: View?) {
//                TODO("Not yet implemented")
//            }
//
//        })

//        btnClick.setOnClickListener(this)
//        btnSubmit.setOnClickListener(this)
//        btnLogin.setOnClickListener(this)


        binding.btnClick.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
        binding.btnLogin.setOnClickListener(this)



        Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT).show()


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_click ->{

            }

            R.id.btn_login ->{

            }
        }
    }

//    override fun onClick(view: View?) {
//        when(view?.id){
//            R.id.btn_click ->{
//                Toast.makeText(this@FirstActivity, " You have click cleck button", Toast.LENGTH_LONG).show()
//            }
//
//            R.id.btn_submit ->{
//                textDisplay.text = etInput.text.toString()
//                Toast.makeText(context,  etInput.text.toString(), Toast.LENGTH_SHORT).show()
//            }
//
//            R.id.btn_login ->{
//                Toast.makeText(context, btnLogin.text.toString(), Toast.LENGTH_SHORT).show()
//            }
//        }
//    }

}