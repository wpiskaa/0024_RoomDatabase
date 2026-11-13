package com.example.pertemuan9.uicontroller

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menemukan jalur untuk composable
     */
    val route: String
    /**
     * String resource id yang berisi judul uang akan ditampilkan di layar halaman
     */
    val titleRes: Int
}

