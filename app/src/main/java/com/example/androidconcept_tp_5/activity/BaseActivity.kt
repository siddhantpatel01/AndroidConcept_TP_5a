package com.example.androidconcept_tp_5.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.example.androidconcept_tp_5.R
import com.google.android.material.snackbar.Snackbar

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    fun customSnackbar(msg: String, view: View, colorCode: Int){
        val snack = Snackbar.make(view, msg, Snackbar.LENGTH_SHORT)
        snack.setAction("Retry", object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@BaseActivity, "asdae", Toast.LENGTH_SHORT).show()
            }

        })
//        snack.setBackgroundTint(resources.getColor(R.color.purple_200))
        val v = snack.view
        val params = v.layoutParams as FrameLayout.LayoutParams
        v.setBackgroundColor(colorCode)
        params.gravity = Gravity.TOP
        snack.show()
    }
}