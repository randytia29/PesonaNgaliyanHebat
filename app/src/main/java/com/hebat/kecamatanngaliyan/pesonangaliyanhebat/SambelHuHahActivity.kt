package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SambelHuHahActivity : AppCompatActivity() {
    private var fabSambelHuHahMap: FloatingActionButton? = null
    private var textViewSambelHuHahContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sambel_hu_hah)
        textViewSambelHuHahContact =
            findViewById<View>(R.id.textview_sambelhuhah_contact) as TextView
        textViewSambelHuHahContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081575440000", null))
            startActivity(intent)
        }
        fabSambelHuHahMap = findViewById<View>(R.id.fab_sambelhuhah_map) as FloatingActionButton
        fabSambelHuHahMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Sambal Hu Hahh")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}