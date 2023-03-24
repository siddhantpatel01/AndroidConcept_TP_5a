package com.example.androidconcept_tp_5.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.viewModels.TwoWayDatabindingViewModel

class TwoWayDatabindingViewModelFactory(private var input: String): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TwoWayDatabindingViewModel::class.java)){
            return TwoWayDatabindingViewModel(input) as T
        }
        throw IllegalArgumentException("Unknown class")
    }
}