package com.example.dimash.barcodescanner.data.model.branch


import com.google.gson.annotations.SerializedName

data class BranchStructure(
    val `data`: List<Data>,
    val success: Boolean
)