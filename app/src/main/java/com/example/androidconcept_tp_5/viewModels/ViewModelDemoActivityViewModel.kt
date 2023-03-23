package com.example.androidconcept_tp_5.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelDemoActivityViewModel(private var inputValue: Int): ViewModel() {
    private var _count: MutableLiveData<Int> = MutableLiveData()
    val totalCount: LiveData<Int> = _count


    init {
        _count.value = inputValue
    }
    fun updateCount(){
        _count.value = _count.value?.plus(1)
    }
}