package com.example.androidconcept_tp_5

import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidconcept_tp_5.databinding.ActivitySecondBinding
import com.example.androidconcept_tp_5.util.Keys
import com.google.gson.Gson
import java.io.Serializable

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val intentData =  intent.getStringExtra(Keys.JSON_USER)
        val user = Gson().fromJson<User>(intentData, User::class.java)
//        var user = intent.getSerializableExtra(Keys.USER) as User
//        val user = intent.getSerializable(Keys.USER, User::class.java)

        binding.tvDisplay.text = "Name - ${user.fName} ${user.lName} \nMobile no - ${user.mobNo}"

//        val bundle = intent.getBundleExtra(Keys.BUNDLE)
//        val fName = bundle!!.getString(Keys.FNAME)
//        val lName = bundle!!.getString(Keys.LNAME)
//        val mobNo = bundle!!.getString(Keys.MOBNO)

//        val fName = intent.getStringExtra("fName")
//        val lName = intent.getStringExtra("lName")
//        val mobNo = intent.getStringExtra("mobNo")

        Log.d("Intent_DATA", "Name - ${user.fName} ${user.lName} \nMobNo - ${user.mobNo}")
    }

    fun <T : Serializable?> Intent.getSerializable(name: String, clazz: Class<T>): T
    {
        return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
            intent.getSerializableExtra(name, clazz)!!
        else
            intent.getSerializableExtra(name) as T
    }
}