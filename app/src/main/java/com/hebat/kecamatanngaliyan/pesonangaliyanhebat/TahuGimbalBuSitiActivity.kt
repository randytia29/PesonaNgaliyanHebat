package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class TahuGimbalBuSitiActivity : AppCompatActivity() {
    private var fabTahuGimbalBuSitiMap: FloatingActionButton? = null
    private var textViewTahuGimbalBuSitiContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahu_gimbal_bu_siti)
        textViewTahuGimbalBuSitiContact =
            findViewById<View>(R.id.textview_tahugimbalbusiti_contact) as TextView
        textViewTahuGimbalBuSitiContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "0247614721", null))
            startActivity(intent)
        }
        fabTahuGimbalBuSitiMap =
            findViewById<View>(R.id.fab_tahugimbalbusiti_map) as FloatingActionButton
        fabTahuGimbalBuSitiMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P5G283W+6HM")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}