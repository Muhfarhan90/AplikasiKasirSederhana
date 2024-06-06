package com.example.aplikasikasirsederhana

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MenuActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var imageAdapter: ImageAdapter
    private lateinit var menuAdapter: MenuAdapter
    private lateinit var categoryMinuman: TextView
    private lateinit var makananList: List<Menu>



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        makananList = listOf(
            Menu("Nasi pecel standard", R.drawable.makanan1, "Rp 6.000"),
            Menu("Nasi Campur Standard", R.drawable.makanan2, "Rp 6.000"),
            Menu("Lauk Ayam Goreng", R.drawable.makanan3, "Rp 4.000"),
            Menu("Lauk Telur Dadar", R.drawable.makanan4, "Rp 3.000"),
            Menu("Lauk Telur Ceplok", R.drawable.makanan5, "Rp 3.000"),
            Menu("Lauk Tempe Mendoan", R.drawable.makanan6, "Rp 2.000"),
            Menu("Lauk Ayam Panggang", R.drawable.makanan7, "Rp 5.000"),
            Menu("Lauk Peyek Udang", R.drawable.makanan8, "Rp 4.000"),
            Menu("Lauk Dadar Jagung", R.drawable.makanan9, "Rp 3.000"),
            Menu("Es Teh", R.drawable.makanan10, "Rp 4.000"),
            Menu("Es Jeruk", R.drawable.makanan10, "Rp 4.000"),
            Menu("Es Milo", R.drawable.makanan10, "Rp 6.000")

        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        categoryMinuman = findViewById(R.id.categoryMinuman)

        menuAdapter = MenuAdapter(makananList)
        recyclerView.adapter = menuAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        viewPager = findViewById(R.id.viewPager)

        val imageList = listOf(
            R.drawable.gambarpromo1,
            R.drawable.gambarpromo2,
            R.drawable.gambarpromo3
        )

        imageAdapter = ImageAdapter(imageList)
        viewPager.adapter = imageAdapter

        }
    }

