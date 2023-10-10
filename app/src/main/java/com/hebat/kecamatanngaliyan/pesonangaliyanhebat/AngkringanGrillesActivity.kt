package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class AngkringanGrillesActivity : AppCompatActivity() {
    private var fabAngkringanGrillesMap: FloatingActionButton? = null
    private var textViewAngkringanGrillesContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angkringan_grilles)
        textViewAngkringanGrillesContact = findViewById(R.id.textview_angkringangrilles_contact)
        textViewAngkringanGrillesContact?.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081575119739", null))
            startActivity(intent)
        }
        fabAngkringanGrillesMap = findViewById(R.id.fab_angkringangrilles_map)
        fabAngkringanGrillesMap?.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Angkringen GRILES")
            val indianIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            indianIntent.setPackage("com.google.android.apps.maps")
            startActivity(indianIntent)
        }
    }
}