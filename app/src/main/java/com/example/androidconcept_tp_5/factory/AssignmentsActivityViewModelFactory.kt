package com.example.androidconcept_tp_5.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidconcept_tp_5.viewModels.AssignmentsActivityViewModel

class AssignmentsActivityViewModelFactory(private val input: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AssignmentsActivityViewModel::class.java)){
            return AssignmentsActivityViewModel(input) as T
        }
        throw IllegalArgumentException("Unknown class")
    }
}