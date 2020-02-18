package com.example.dimash.barcodescanner.data.model.branch


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Data(
    @PrimaryKey
    val firmId: String,
    val id: String,
    val name: String
)