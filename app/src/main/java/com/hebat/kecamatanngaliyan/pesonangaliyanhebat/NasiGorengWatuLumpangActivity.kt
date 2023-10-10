package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class NasiGorengWatuLumpangActivity : AppCompatActivity() {
    private var fabNasiGorengWatulumpangMap: FloatingActionButton? = null
    private var textViewNasiGorengWatulumpangContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasi_goreng_watu_lumpang)
        textViewNasiGorengWatulumpangContact =
            findViewById<View>(R.id.textview_nasigorengwatulumpang_contact) as TextView
        textViewNasiGorengWatulumpangContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081228229737", null))
            startActivity(intent)
        }
        fabNasiGorengWatulumpangMap =
            findViewById<View>(R.id.fab_nasigorengwatulumpang_map) as FloatingActionButton
        fabNasiGorengWatulumpangMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P5G2948+5R")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}