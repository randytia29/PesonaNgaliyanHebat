package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class CafeSemilirActivity : AppCompatActivity() {
    private var fabCafeSemilirMap: FloatingActionButton? = null
    private var textViewCafeSemilirContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_semilir)
        textViewCafeSemilirContact =
            findViewById<View>(R.id.textview_cafesemilir_contact) as TextView
        textViewCafeSemilirContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082136420224", null))
            startActivity(intent)
        }
        fabCafeSemilirMap = findViewById(R.id.fab_cafesemilir_map)
        fabCafeSemilirMap?.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Semilir Cafe")
            val indianIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            indianIntent.setPackage("com.google.android.apps.maps")
            startActivity(indianIntent)
        }
    }
}