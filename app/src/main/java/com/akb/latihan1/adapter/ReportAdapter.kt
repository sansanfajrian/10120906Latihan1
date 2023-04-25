package com.akb.latihan1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.akb.latihan1.R
import com.google.android.material.card.MaterialCardView

/**
 * Tanggal Pengerjaan : 25/04/2023
 * NIM : 10120906
 * Nama : Sansan Fajrian
 * Kelas : IF-10
 * */

class ReportAdapter(private val currentList: List<Int>) : RecyclerView.Adapter<ReportAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_report, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item = currentList[position])
    }

    override fun getItemCount(): Int = currentList.size

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        fun bind(item: Int) {
            itemView.let {
                val reportView = it.findViewById<MaterialCardView>(R.id.cvReport)

                reportView.setCardBackgroundColor(ContextCompat.getColor(it.context, item))
            }
        }
    }

}