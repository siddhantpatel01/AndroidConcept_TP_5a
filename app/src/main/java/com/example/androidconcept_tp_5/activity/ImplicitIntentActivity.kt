package com.example.androidconcept_tp_5.activity

import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityImplicitIntentBinding

class ImplicitIntentActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityImplicitIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActionView.setOnClickListener(this)
        binding.btnActionDial.setOnClickListener(this)
        binding.btnActionCall.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.btn_action_view ->{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/Intent"))
                startActivity(intent)
            }

            R.id.btn_action_dial ->{
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:111111111")
                startActivity(intent)
            }

            R.id.btn_action_call ->{


                if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) == PERMISSION_GRANTED){
                    val intent = Intent(Intent.ACTION_CALL)
                    intent.data = Uri.parse("tel:1234567890")
                    startActivity(intent)
                }else{
                    ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 1001)
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1001){
            if(grantResults.isNotEmpty() && permissions[0].equals(PackageManager.PERMISSION_GRANTED)){

            }else{
                Toast.makeText(this, "Please give permission", Toast.LENGTH_SHORT).show()
            }

        }
    }
}