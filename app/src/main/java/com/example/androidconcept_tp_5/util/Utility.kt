package com.example.androidconcept_tp_5.util

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Utility {
    companion object{
        fun customSnackbar(msg: String, view: View, colorCode: Int, context: Context){
            val snack = Snackbar.make(view, msg, Snackbar.LENGTH_SHORT)
            snack.setAction("Retry", object: View.OnClickListener{
                override fun onClick(p0: View?) {
                    Toast.makeText(context, "asdae", Toast.LENGTH_SHORT).show()
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
}