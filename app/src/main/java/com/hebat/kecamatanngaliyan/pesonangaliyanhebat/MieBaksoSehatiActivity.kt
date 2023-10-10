package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MieBaksoSehatiActivity : AppCompatActivity() {
    private var fabMieBaksoSehatiMap: FloatingActionButton? = null
    private var textViewMieBaksoSehatiContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mie_bakso_sehati)
        textViewMieBaksoSehatiContact =
            findViewById<View>(R.id.textview_miebaksosehati_contact) as TextView
        textViewMieBaksoSehatiContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085842774250", null))
            startActivity(intent)
        }
        fabMieBaksoSehatiMap =
            findViewById<View>(R.id.fab_miebaksosehati_map) as FloatingActionButton
        fabMieBaksoSehatiMap!!.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:0,0?q=Warung Mie Bakso Sehat,i, Wonosari, Ngaliyan, Semarang City, Central Java 50244")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}