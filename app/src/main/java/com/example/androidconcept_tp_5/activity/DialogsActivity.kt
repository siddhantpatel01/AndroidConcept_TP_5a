package com.example.androidconcept_tp_5.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityDialogsBinding

class DialogsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDialogsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlertDialog.setOnClickListener(this)
        binding.btnProgressDialog.setOnClickListener(this)
        binding.btnCustomDialog.setOnClickListener(this)

//        finish()
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_alert_dialog ->{
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setTitle(resources.getString(R.string.app_name))
                alertDialog.setMessage("Do you want to exit?")
                alertDialog.setCancelable(false)
                alertDialog.setPositiveButton("Exit", object: DialogInterface.OnClickListener{
                    override fun onClick(di: DialogInterface?, p1: Int) {
                            finish()
                    }

                })

                alertDialog.setNegativeButton("No", object: DialogInterface.OnClickListener{
                    override fun onClick(p0: DialogInterface?, p1: Int) {

                    }

                })

                alertDialog.show()

//                var alert: AlertDialog = alertDialog.create()
//                alert.show()
//
//                alert.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(resources.getColor(R.color.black))
//                alert.getButton(DialogInterface.BUTTON_POSITIVE).isAllCaps = false


            }

            R.id.btn_progress_dialog ->{

            }

            R.id.btn_custom_dialog ->{

            }
        }
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()
    }
}