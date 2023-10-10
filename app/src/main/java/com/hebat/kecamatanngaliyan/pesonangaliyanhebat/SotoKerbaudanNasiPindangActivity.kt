package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SotoKerbaudanNasiPindangActivity : AppCompatActivity() {
    private var fabSotoKerbaudanNasiPindangMap: FloatingActionButton? = null
    private var textViewSotoKerbaudanNasiPindangContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soto_kerbaudan_nasi_pindang)
        textViewSotoKerbaudanNasiPindangContact =
            findViewById<View>(R.id.textview_sotokerbaudannasipindang_contact) as TextView
        textViewSotoKerbaudanNasiPindangContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085740085265", null))
            startActivity(intent)
        }
        fabSotoKerbaudanNasiPindangMap = findViewById(R.id.fab_sotokerbaudannasipindang_map)
        fabSotoKerbaudanNasiPindangMap?.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Soto Kerbau Dan Pindang Kerbau Mbah Modin")
            val indianIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            indianIntent.setPackage("com.google.android.apps.maps")
            startActivity(indianIntent)
        }
    }
}