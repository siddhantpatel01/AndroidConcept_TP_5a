package com.example.androidconcept_tp_5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityViewModelDemoBinding
import com.example.androidconcept_tp_5.viewModels.ViewModelDemoActivityViewModel

class ViewModelDemoActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewModelDemoBinding
    lateinit var viewModel: ViewModelDemoActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model_demo)
        viewModel = ViewModelProvider(this)[ViewModelDemoActivityViewModel::class.java]
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel



//        binding.tvCount.text = viewModel._count.toString()

        binding.btnCount.setOnClickListener {
            viewModel.updateCount()
//            binding.tvCount.text = viewModel._count.toString()
        }
    }
}