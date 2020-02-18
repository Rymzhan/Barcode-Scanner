package com.example.dimash.barcodescanner.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dimash.barcodescanner.R
import com.example.dimash.barcodescanner.data.model.firm.Data
import kotlinx.android.synthetic.main.item_view.view.*

class FirmAdapter(private val dataList: MutableList<Data>) : RecyclerView.Adapter<FirmHolder>() {
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirmHolder {
        context = parent.context
        return FirmHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: FirmHolder, position: Int) {
        val data = dataList[position]

        val firmNameTextView = holder.itemView.firm_name
        val firmIdTextView = holder.itemView.firm_id

        val firmName = "${data.name}"
        firmNameTextView.text = firmName

        val firmId = "${data.id}"
        firmIdTextView.text = firmId
    }
}