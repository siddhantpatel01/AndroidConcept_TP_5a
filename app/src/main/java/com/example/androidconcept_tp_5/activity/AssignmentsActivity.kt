package com.example.androidconcept_tp_5.activity

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityAssignmentsBinding
import com.example.androidconcept_tp_5.factory.AssignmentsActivityViewModelFactory
import com.example.androidconcept_tp_5.viewModels.AssignmentsActivityViewModel

class AssignmentsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAssignmentsBinding
    private lateinit var factory: AssignmentsActivityViewModelFactory
    private lateinit var viewModel: AssignmentsActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_assignments)
        binding.lifecycleOwner = this
        factory = AssignmentsActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, factory)[AssignmentsActivityViewModel::class.java]
        binding.myViewModel = viewModel

//        binding.tvDisplay.text = viewModel.getCurrentValue().toString()

//        viewModel.total.observe(this, Observer {
//            binding.tvDisplay.text = it.toString()
//        })

        binding.btnAdd.setOnClickListener {
            viewModel.setCurrentValue(binding.etInputNumber.text.toString().toInt())
//            binding.tvDisplay.text = viewModel.getCurrentValue().toString()
        }
    }
}