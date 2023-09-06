package com.example.tflapp.data.model


import com.google.gson.annotations.SerializedName

data class ServiceTypeModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("type")
    val type: String? = "",
    @SerializedName("uri")
    val uri: String? = ""
)