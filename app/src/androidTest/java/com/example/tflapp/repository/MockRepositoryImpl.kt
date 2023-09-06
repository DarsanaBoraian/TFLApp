package com.example.tflapp.repository

import com.example.tflapp.data.model.*
import com.example.tflapp.data.model.TFL
import com.example.tflapp.data.repository.Repository

class MockRepositoryImpl : Repository{
    override suspend fun getTFLData(): TFL {
        val tfl  =  TFL()
        tfl.addAll(listOf(
            TFLItemModel()
        ))
        return tfl
    }
}