package com.example.androidconcept_tp_5.viewModels

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AssignmentsActivityViewModel(private var value1: Int): ViewModel() {
//    var total: Int = 0
    var total: MutableLiveData<Int> = MutableLiveData()
    init {
//        total = value
        total.value = value1
    }

//    fun getCurrentValue(): Int{
//        return total
//    }
    
    fun setCurrentValue(input: Int){
        total.value = total.value?.plus(input)
    }
}