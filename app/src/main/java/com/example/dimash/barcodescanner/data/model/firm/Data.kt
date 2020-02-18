package com.example.dimash.barcodescanner.data.model.firm


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)