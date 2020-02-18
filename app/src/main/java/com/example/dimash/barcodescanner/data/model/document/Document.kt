package com.example.dimash.barcodescanner.data.model.document

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dimash.barcodescanner.data.model.firm.Data
import java.util.*


@Entity
data class Document(
    @PrimaryKey
    val docId: Int,
    val name: String,
    val isArchive: Int,
    val startDate: Date,
    val complete: Date,
    val idOfFirm: String


)