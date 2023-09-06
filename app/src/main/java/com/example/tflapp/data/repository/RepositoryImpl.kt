package com.example.tflapp.data.repository

import com.example.tflapp.data.model.TFL
import com.example.tflapp.data.remote.ApiRequest
import com.example.tflapp.data.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiRequest: ApiRequest
) : Repository {

    override suspend fun getTFLData(): TFL {
        return apiRequest.getTFLData()
    }

}