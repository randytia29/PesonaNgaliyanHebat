package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class KelapaBakarBuWarsitoActivity : AppCompatActivity() {
    private var fabKelapaBakarBuWarsitoMap: FloatingActionButton? = null
    private var textViewKelapaBakarBuWarsitoContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelapa_bakar_bu_warsito)
        textViewKelapaBakarBuWarsitoContact =
            findViewById(R.id.textview_kelapabakarbuwarsito_contact)
        textViewKelapaBakarBuWarsitoContact?.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085640921021", null))
            startActivity(intent)
        }
        fabKelapaBakarBuWarsitoMap = findViewById(R.id.fab_kelapabakarbuwarsito_map)
        fabKelapaBakarBuWarsitoMap?.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Kelapa Bakar Ibu Warsito")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}