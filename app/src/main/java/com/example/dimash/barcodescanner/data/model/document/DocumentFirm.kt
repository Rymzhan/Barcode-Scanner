package com.example.dimash.barcodescanner.data.model.document

import androidx.room.Embedded
import androidx.room.Relation
import com.example.dimash.barcodescanner.data.model.firm.Data

data class DocumentFirm(
    @Embedded val data: Data,
    @Relation(
        parentColumn = "firmId",
        entityColumn = "idOfFirm"
    )
    val docList: List<Document>
)