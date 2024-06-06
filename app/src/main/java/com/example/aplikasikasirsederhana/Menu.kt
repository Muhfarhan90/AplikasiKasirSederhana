package com.example.aplikasikasirsederhana

data class Menu(
    val name: String,
    val imageResId: Int,
    val price: String,
    var quantity: Int = 0)

