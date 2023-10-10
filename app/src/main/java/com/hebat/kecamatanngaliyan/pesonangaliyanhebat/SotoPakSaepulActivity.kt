package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SotoPakSaepulActivity : AppCompatActivity() {
    private var fabSotoPakSaepulMap: FloatingActionButton? = null
    private var textViewSotoPakSaepulContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soto_pak_saepul)
        textViewSotoPakSaepulContact =
            findViewById<View>(R.id.textview_sotopaksaepul_contact) as TextView
        textViewSotoPakSaepulContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081215604414", null))
            startActivity(intent)
        }
        fabSotoPakSaepulMap = findViewById<View>(R.id.fab_sotopaksaepul_map) as FloatingActionButton
        fabSotoPakSaepulMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Permata GardenJl gondorio Barat")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}