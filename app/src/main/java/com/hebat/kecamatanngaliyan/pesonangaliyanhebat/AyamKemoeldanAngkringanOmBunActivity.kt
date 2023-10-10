package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class AyamKemoeldanAngkringanOmBunActivity : AppCompatActivity() {
    private var fabAyamKemoeldanAngkringanOmBunMap: FloatingActionButton? = null
    private var textViewAyamKemoeldanAngkringanOmBunContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayam_kemoeldan_angkringan_om_bun)
        textViewAyamKemoeldanAngkringanOmBunContact =
            findViewById<View>(R.id.textview_ayamkemoelombun_contact) as TextView
        textViewAyamKemoeldanAngkringanOmBunContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085600352628", null))
            startActivity(intent)
        }
        fabAyamKemoeldanAngkringanOmBunMap = findViewById(R.id.fab_ayamkemoeldanangkringanombun_map)
        fabAyamKemoeldanAngkringanOmBunMap?.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:0,0?q=Ayam Kemoel Om Bun, Jl. Pengilon II, Bringin, Ngaliyan, Kota Semarang, Jawa Tengah 50189")
            val indianIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            indianIntent.setPackage("com.google.android.apps.maps")
            startActivity(indianIntent)
        }
    }
}