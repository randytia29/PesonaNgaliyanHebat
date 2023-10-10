package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var imageViewTematik: ImageView? = null
    private var imageViewWisata: ImageView? = null
    private var imageViewKuliner: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageViewTematik = findViewById(R.id.imageView_tematik)
        imageViewWisata = findViewById(R.id.imageView_wisata)
        imageViewKuliner = findViewById(R.id.imageView_kuliner)
        imageViewTematik?.setOnClickListener {
            val intentTematik = Intent(this@MainActivity, TematikActivity::class.java)
            startActivity(intentTematik)
            finish()
        }
        imageViewWisata?.setOnClickListener {
            val intentWisata = Intent(this@MainActivity, WisataActivity::class.java)
            startActivity(intentWisata)
            finish()
        }
        imageViewKuliner?.setOnClickListener {
            val intentKuliner = Intent(this@MainActivity, KulinerActivity::class.java)
            startActivity(intentKuliner)
            finish()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}