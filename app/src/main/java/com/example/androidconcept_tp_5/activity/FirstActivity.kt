package com.example.androidconcept_tp_5.activity

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityFirstBinding

class FirstActivity: AppCompatActivity(), OnClickListener,
    RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {
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
        context = this@FirstActivity

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

        binding.rgGender.setOnCheckedChangeListener(this)
        binding.cbMale.setOnCheckedChangeListener(this)
        binding.cbFemale.setOnCheckedChangeListener(this)
        binding.cbTsGender.setOnCheckedChangeListener(this)



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
                if(binding.etInput.text.isEmpty() && binding.etLname.text.isEmpty()){
                    Toast.makeText(context, "Both fields are mandatory.", Toast.LENGTH_SHORT).show()
                    return
                }else if (binding.etInput.text.isEmpty()){
                    binding.etInput.requestFocus()
                    Toast.makeText(context, "Field is mandatory", Toast.LENGTH_SHORT).show()
                    return
                }else if (binding.etLname.text.isEmpty()){
                    binding.etLname.requestFocus()
                    Toast.makeText(context, "Field is mandatory", Toast.LENGTH_SHORT).show()
                    return
                }else{
                    Toast.makeText(context, "Do ur JOB", Toast.LENGTH_SHORT).show()
                }
            }

            R.id.btn_login ->{

            }
        }
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when(group?.checkedRadioButtonId){
            R.id.rb_male ->{
                val rbMale = findViewById<RadioButton>(checkedId)
                Toast.makeText(context, rbMale.text.toString(), Toast.LENGTH_SHORT).show()
            }

            R.id.rb_female ->{
                val rbFeMale = findViewById<RadioButton>(checkedId)
                Toast.makeText(context, rbFeMale.text.toString(), Toast.LENGTH_SHORT).show()
            }

            R.id.rb_transgender ->{
                val rbTransGender = findViewById<RadioButton>(checkedId)
                Toast.makeText(context, rbTransGender.text.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView?.id){
            R.id.cb_male ->{
                Toast.makeText(context, binding.cbMale.text.toString(), Toast.LENGTH_SHORT).show()
            }

            R.id.cb_female ->{
                Toast.makeText(context, binding.cbFemale.text.toString(), Toast.LENGTH_SHORT).show()
            }

            R.id.cb_ts_gender ->{
                Toast.makeText(context, binding.cbTsGender.text.toString(), Toast.LENGTH_SHORT).show()
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