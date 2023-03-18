package com.example.androidconcept_tp_5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityDatabindingBinding
import com.example.androidconcept_tp_5.model.Student

class DatabindingActivity : BaseActivity() {
    private lateinit var binding: ActivityDatabindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        binding.student = Student("Andy", "Rubin")

    }
}