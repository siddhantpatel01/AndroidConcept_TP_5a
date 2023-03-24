package com.example.androidconcept_tp_5.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayDatabindingViewModel(private val inputName: String): ViewModel() {
    var name: MutableLiveData<String> = MutableLiveData()

    init {
        name.value = inputName
    }

}