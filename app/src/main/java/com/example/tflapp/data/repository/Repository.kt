package com.example.tflapp.data.repository

import com.example.tflapp.data.model.TFL

interface Repository {

    suspend fun getTFLData(): TFL
}