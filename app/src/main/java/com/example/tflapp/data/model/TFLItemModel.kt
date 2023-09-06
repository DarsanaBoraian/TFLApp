package com.example.tflapp.data.model


import com.google.gson.annotations.SerializedName

data class TFLItemModel(
    @SerializedName("created")
    val created: String? = "",
    @SerializedName("crowding")
    val crowding: CrowdingModel? = CrowdingModel(),
    @SerializedName("disruptions")
    val disruptions: List<Any?>? = listOf(),
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("lineStatuses")
    val lineStatuses: List<LineStatuseModel?>? = listOf(),
    @SerializedName("modeName")
    val modeName: String? = "",
    @SerializedName("modified")
    val modified: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("routeSections")
    val routeSections: List<Any>? = listOf(),
    @SerializedName("serviceTypes")
    val serviceTypes: List<ServiceTypeModel?>? = listOf(),
    @SerializedName("type")
    val type: String? = ""
)