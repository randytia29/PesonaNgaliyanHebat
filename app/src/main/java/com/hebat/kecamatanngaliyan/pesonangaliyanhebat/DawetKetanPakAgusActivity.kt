package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class DawetKetanPakAgusActivity : AppCompatActivity() {
    private var fabDawetKetanPakAgusMap: FloatingActionButton? = null
    private var textViewDawetKetanPakAgusContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dawet_ketan_pak_agus)
        textViewDawetKetanPakAgusContact =
            findViewById<View>(R.id.textview_dawetketanpakagus_contact) as TextView
        textViewDawetKetanPakAgusContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081325999441", null))
            startActivity(intent)
        }
        fabDawetKetanPakAgusMap =
            findViewById<View>(R.id.fab_dawetketanpakagus_map) as FloatingActionButton
        fabDawetKetanPakAgusMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P4GX8QQ+M3V")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}