package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class AngkringanPingtoEatActivity : AppCompatActivity() {
    private var fabAngkringanPingtoEatMap: FloatingActionButton? = null
    private var textViewAngkringanPingtoEatContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angkringan_pingto_eat)
        textViewAngkringanPingtoEatContact =
            findViewById<View>(R.id.textview_angkringanpingtoeat_contact) as TextView
        textViewAngkringanPingtoEatContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082220111046", null))
            startActivity(intent)
        }
        fabAngkringanPingtoEatMap =
            findViewById<View>(R.id.fab_angkringanpingtoeat_map) as FloatingActionButton
        fabAngkringanPingtoEatMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=Angkringan Ping to Eat")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}