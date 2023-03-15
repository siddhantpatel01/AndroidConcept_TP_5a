package com.example.androidconcept_tp_5.activity

import android.app.ActionBar.LayoutParams
import android.app.Dialog
import android.app.ProgressDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityDialogsBinding
import com.example.androidconcept_tp_5.databinding.LayoutCustomBinding

class DialogsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDialogsBinding
    val TAG: String= "DIALOGACTIVITY"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlertDialog.setOnClickListener(this)
        binding.btnProgressDialog.setOnClickListener(this)
        binding.btnCustomDialog.setOnClickListener(this)


        Log.d(TAG, "onCreate() ")

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
                ProgressDialog(this).apply {
                    this.setCancelable(false)
                    this.setTitle(resources.getString(R.string.app_name))
                    this.setMessage("Please wait")
                    this.setProgressStyle(ProgressDialog.STYLE_SPINNER)
                }.show()
            }

            R.id.btn_custom_dialog ->{
                val layoutCustomBinding = LayoutCustomBinding.inflate(layoutInflater)
                val dialog = Dialog(this)
                dialog.setContentView(layoutCustomBinding.root)
                dialog.setCancelable(false)
                val windowManager = WindowManager.LayoutParams()
                windowManager.width = LayoutParams.MATCH_PARENT
                windowManager.height = LayoutParams.WRAP_CONTENT
                dialog.window?.attributes = windowManager
                dialog.show()


                layoutCustomBinding.btnSubmit.setOnClickListener {
                    Toast.makeText(this, "${layoutCustomBinding.tilFname.editText?.text.toString()} ${layoutCustomBinding.tilLname.editText?.text.toString()}", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() ")
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()
    }
}