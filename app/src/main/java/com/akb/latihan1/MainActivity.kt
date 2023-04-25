package com.akb.latihan1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.akb.latihan1.DataCollection.menu
import com.akb.latihan1.DataCollection.reportApril
import com.akb.latihan1.DataCollection.reportMarch
import com.akb.latihan1.adapter.MenuAdapter
import com.akb.latihan1.adapter.ReportAdapter

/**
 * Tanggal Pengerjaan : 25/04/2023
 * NIM : 10120906
 * Nama : Sansan Fajrian
 * Kelas : IF-10
 * */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reportFirstMonthList = findViewById<RecyclerView>(R.id.rvFirstMonth)
        val reportSecondMonthList = findViewById<RecyclerView>(R.id.rvSecondMonth)
        val menuList = findViewById<RecyclerView>(R.id.rvMenu)

        reportFirstMonthList.adapter = ReportAdapter(reportMarch)
        reportSecondMonthList.adapter = ReportAdapter(reportApril)
        menuList.adapter = MenuAdapter(menu)

    }
}