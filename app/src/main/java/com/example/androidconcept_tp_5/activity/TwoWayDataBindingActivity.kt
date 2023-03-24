package com.example.androidconcept_tp_5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.R
import com.example.androidconcept_tp_5.databinding.ActivityAssignmentsBinding
import com.example.androidconcept_tp_5.databinding.ActivityTwoWayDataBindingBinding
import com.example.androidconcept_tp_5.factory.AssignmentsActivityViewModelFactory
import com.example.androidconcept_tp_5.factory.TwoWayDatabindingViewModelFactory
import com.example.androidconcept_tp_5.viewModels.AssignmentsActivityViewModel
import com.example.androidconcept_tp_5.viewModels.TwoWayDatabindingViewModel

class TwoWayDataBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWayDataBindingBinding
    private lateinit var factory: TwoWayDatabindingViewModelFactory
    private lateinit var viewModel: TwoWayDatabindingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_data_binding)
        factory = TwoWayDatabindingViewModelFactory("DEFAULT VALUE")
        viewModel = ViewModelProvider(this, factory)[TwoWayDatabindingViewModel::class.java]
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel

    }
}