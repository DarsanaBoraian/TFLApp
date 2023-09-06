package com.example.tflapp.data.remote

import com.example.tflapp.data.model.TFL
import retrofit2.http.GET

interface ApiRequest {

    @GET(ApiDetails.LINE_STATUS)
    suspend fun getTFLData(): TFL
}