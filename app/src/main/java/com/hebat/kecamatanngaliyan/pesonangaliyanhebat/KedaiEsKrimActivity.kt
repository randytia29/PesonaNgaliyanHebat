package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class KedaiEsKrimActivity : AppCompatActivity() {
    private var fabKedaiEsKrimMap: FloatingActionButton? = null
    private var textViewKedaiEsKrimContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedai_es_krim)
        textViewKedaiEsKrimContact =
            findViewById<View>(R.id.textview_kedaieskrim_contact) as TextView
        textViewKedaiEsKrimContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082323675807", null))
            startActivity(intent)
        }
        fabKedaiEsKrimMap = findViewById<View>(R.id.fab_kedaieskrim_map) as FloatingActionButton
        fabKedaiEsKrimMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P5G285F+35")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}