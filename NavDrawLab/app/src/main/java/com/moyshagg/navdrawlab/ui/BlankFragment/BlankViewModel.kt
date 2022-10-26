package com.moyshagg.navdrawlab.ui.BlankFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is blank Fragment"
    }
    val text: LiveData<String> = _text
}