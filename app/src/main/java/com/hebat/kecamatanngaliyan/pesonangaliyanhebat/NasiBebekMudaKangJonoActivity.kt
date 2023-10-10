package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class NasiBebekMudaKangJonoActivity : AppCompatActivity() {
    private var fabNasiBebekMudaKangJonoMap: FloatingActionButton? = null
    private var textViewNasiBebekMudaKangJonoContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasi_bebek_muda_kang_jono)
        textViewNasiBebekMudaKangJonoContact =
            findViewById<View>(R.id.textview_nasibebekmudakangjono_contact) as TextView
        textViewNasiBebekMudaKangJonoContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085647065290", null))
            startActivity(intent)
        }
        fabNasiBebekMudaKangJonoMap =
            findViewById<View>(R.id.fab_nasibebekmudakangjono_map) as FloatingActionButton
        fabNasiBebekMudaKangJonoMap!!.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:0,0?q=Warung Bebek Kang Jono, no. 21,, Jl. Purwoyoso 1C, Purwoyoso, Ngaliyan, Kota Semarang, Jawa Tengah 50184")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}