package com.example.tflapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tflapp.data.model.TFL
import com.example.tflapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _tflData = MutableStateFlow(TFL())
    val tflData: StateFlow<TFL> = _tflData

    init {
        getTFLData()
    }

    fun getTFLData() {
        viewModelScope.launch {
            _tflData.value = repository.getTFLData()
        }
    }
}