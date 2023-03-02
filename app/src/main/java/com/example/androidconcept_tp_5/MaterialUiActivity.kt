package com.example.androidconcept_tp_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import com.example.androidconcept_tp_5.databinding.ActivityMaterialUiBinding

class MaterialUiActivity : AppCompatActivity(), View.OnClickListener {
   lateinit var binding: ActivityMaterialUiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaterialUiBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if (binding.tilLname.editText!!.text.toString().length == 20){
//            binding.tilLname.error = "YOu have reached.."
//            binding.tilFname.isErrorEnabled = true
//            binding.tilLname.
//        }

        binding.btnSubmit.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, binding.tilLname.editText!!.text.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}