package com.akb.latihan1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.akb.latihan1.MenuWrapper
import com.akb.latihan1.R
import com.google.android.material.textview.MaterialTextView

/**
 * Tanggal Pengerjaan : 25/04/2023
 * NIM : 10120906
 * Nama : Sansan Fajrian
 * Kelas : IF-10
 * */

class MenuAdapter(private val currentList: List<MenuWrapper>) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item = currentList[position])
    }

    override fun getItemCount(): Int = currentList.size

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        fun bind(item: MenuWrapper) {
            itemView.let {
                val image = it.findViewById<AppCompatImageView>(R.id.ivMenu)
                val title = it.findViewById<MaterialTextView>(R.id.tvMenu)

                image.setImageResource(item.image)
                title.text = it.context.resources.getString(item.title)
            }
        }
    }

}