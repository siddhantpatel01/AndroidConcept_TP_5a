package com.example.androidconcept_tp_5.viewModels

import androidx.lifecycle.ViewModel

class ViewModelDemoActivityViewModel: ViewModel() {
    var _count: Int = 100


    fun updateCount(){
        _count++
    }
}