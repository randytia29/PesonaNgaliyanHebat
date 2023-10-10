package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class LeleKetawaActivity : AppCompatActivity() {
    private var fabLeleKetawaMap: FloatingActionButton? = null
    private var textViewLeleKetawaContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lele_ketawa)
        textViewLeleKetawaContact = findViewById<View>(R.id.textview_leleketawa_contact) as TextView
        textViewLeleKetawaContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082134725858", null))
            startActivity(intent)
        }
        fabLeleKetawaMap = findViewById<View>(R.id.fab_leleketawa_map) as FloatingActionButton
        fabLeleKetawaMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P5G286H+G8M")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}