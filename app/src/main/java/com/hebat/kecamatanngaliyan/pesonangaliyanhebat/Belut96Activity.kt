package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class Belut96Activity : AppCompatActivity() {
    private var fabBelut96Map: FloatingActionButton? = null
    private var textViewBelut96Contact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belut96)
        textViewBelut96Contact = findViewById<View>(R.id.textview_belut96_contact) as TextView
        textViewBelut96Contact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082137384954", null))
            startActivity(intent)
        }
        fabBelut96Map = findViewById<View>(R.id.fab_belut96_map) as FloatingActionButton
        fabBelut96Map!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P4GX8MQ+R8")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}