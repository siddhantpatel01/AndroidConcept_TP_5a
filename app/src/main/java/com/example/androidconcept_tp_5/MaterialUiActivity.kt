package com.example.androidconcept_tp_5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import com.example.androidconcept_tp_5.databinding.ActivityMaterialUiBinding

class MaterialUiActivity : AppCompatActivity(), View.OnClickListener {
   lateinit var binding: ActivityMaterialUiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaterialUiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)

//        if (binding.tilLname.editText!!.text.toString().length == 20){
//            binding.tilLname.error = "YOu have reached.."
//            binding.tilFname.isErrorEnabled = true
//            binding.tilLname.
//        }

        binding.btnSubmit.setOnClickListener(this)

//        registerForContextMenu(binding.btnSubmit)

    }

    override fun onClick(view: View?) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("fName", binding.tilFname.editText!!.text.toString())
            intent.putExtra("lName", binding.tilLname.editText!!.text.toString())
            intent.putExtra("mobNo", binding.tilMobno.editText!!.text.toString())
            startActivity(intent)









//        val popupMenu = PopupMenu(this, view)
//        menuInflater.inflate(R.menu.options_menu, popupMenu.menu)
//        popupMenu.show()
//
//        popupMenu.setOnMenuItemClickListener(object: PopupMenu.OnMenuItemClickListener{
//            override fun onMenuItemClick(item: MenuItem?): Boolean {
//                when(item?.itemId){
//                    R.id.item_1 ->{
//                        Toast.makeText(this@MaterialUiActivity, item.title, Toast.LENGTH_SHORT).show()
//                    }
//
//                    R.id.item_2 ->{
//                        Toast.makeText(this@MaterialUiActivity, item.title, Toast.LENGTH_SHORT).show()
//                    }
//                }
//                return true
//            }
//
//
//        })
//        Toast.makeText(this, binding.tilLname.editText!!.text.toString(), Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)

        val menuBuilder = menu as MenuBuilder
        menuBuilder.setOptionalIconsVisible(true)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_1 ->{
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            }

            R.id.item_2 ->{
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.options_menu, menu)
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_1 ->{
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            }

            R.id.item_2 ->{
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}