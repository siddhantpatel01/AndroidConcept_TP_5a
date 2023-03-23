package com.example.androidconcept_tp_5.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.viewModels.ViewModelDemoActivityViewModel

class ViewModelDemoActivityViewModelFactory(private var input:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelDemoActivityViewModel::class.java)){
            return ViewModelDemoActivityViewModel(input) as T
        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }
}