package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class NasiGorengVespaActivity : AppCompatActivity() {
    private var fabNasiGorengVespaMap: FloatingActionButton? = null
    private var textViewNasiGorengVespaContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasi_goreng_vespa)
        textViewNasiGorengVespaContact =
            findViewById<View>(R.id.textview_nasigorengvespa_contact) as TextView
        textViewNasiGorengVespaContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085974731616", null))
            startActivity(intent)
        }
        fabNasiGorengVespaMap =
            findViewById<View>(R.id.fab_nasigorengvespa_map) as FloatingActionButton
        fabNasiGorengVespaMap!!.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:0,0?q=Waroeng Scooter, Ngaliyan, Semarang City, Central Java 50181")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}