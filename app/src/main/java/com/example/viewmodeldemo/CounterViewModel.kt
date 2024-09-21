package com.example.viewmodeldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _count = MutableLiveData<Int>().apply { value = 0 }
    val count: LiveData<Int> get() = _count


    fun increment() {
        _count.value = (_count.value ?: 0) + 1
    }
}
