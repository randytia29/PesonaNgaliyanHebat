package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class NasiGorengMasSastroActivity : AppCompatActivity() {
    private var fabNasiGorengMasSastroMap: FloatingActionButton? = null
    private var textViewNasiGorengMasSastroContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasi_goreng_mas_sastro)
        textViewNasiGorengMasSastroContact =
            findViewById<View>(R.id.textview_nasigorengmassastro_contact) as TextView
        textViewNasiGorengMasSastroContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081542306103", null))
            startActivity(intent)
        }
        fabNasiGorengMasSastroMap =
            findViewById<View>(R.id.fab_nasigorengmassastro_map) as FloatingActionButton
        fabNasiGorengMasSastroMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Nasi Goreng Mas Sastro")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}