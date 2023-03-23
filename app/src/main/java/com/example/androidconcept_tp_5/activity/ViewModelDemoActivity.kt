package com.example.androidconcept_tp_5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityViewModelDemoBinding
import com.example.androidconcept_tp_5.factory.ViewModelDemoActivityViewModelFactory
import com.example.androidconcept_tp_5.viewModels.ViewModelDemoActivityViewModel

class ViewModelDemoActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewModelDemoBinding
    lateinit var viewModel: ViewModelDemoActivityViewModel
    lateinit var factory: ViewModelDemoActivityViewModelFactory
//      private val viewModel: ViewModelDemoActivityViewModel by viewModels()
//private val viewModel: ViewModelDemoActivityViewModel by viewModels(ViewModelDemoActivityViewModelFactory(10))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model_demo)
        factory = ViewModelDemoActivityViewModelFactory(10)
        viewModel = ViewModelProvider(this, factory)[ViewModelDemoActivityViewModel::class.java]
//        binding.tvCount.text = viewModel._count.toString()
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel


//        viewModel.totalCount.observe(this, Observer {
//            binding.tvCount.text = it.toString()
//        })

//        binding.btnCount.setOnClickListener {
//            viewModel.updateCount()
////            binding.tvCount.text = viewModel._count.toString()
//        }
    }
}