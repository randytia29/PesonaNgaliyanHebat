package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SevenPavilionActivity : AppCompatActivity() {
    private var fabSevenPavilionMap: FloatingActionButton? = null
    private var textViewSevenPavilionContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven_pavilion)
        textViewSevenPavilionContact =
            findViewById<View>(R.id.textview_sevenpavilion_contact) as TextView
        textViewSevenPavilionContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082133456788", null))
            startActivity(intent)
        }
        fabSevenPavilionMap = findViewById<View>(R.id.fab_sevenpavilion_map) as FloatingActionButton
        fabSevenPavilionMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Seven Pavillon")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}