package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class PecelGablokMbakMulActivity : AppCompatActivity() {
    private var fabPecelGablokMbakMulMap: FloatingActionButton? = null
    private var textViewPecelGablokMbakMulContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pecel_gablok_mbak_mul)
        textViewPecelGablokMbakMulContact =
            findViewById<View>(R.id.textview_pecelgablokmbakmul_contact) as TextView
        textViewPecelGablokMbakMulContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "087832758584", null))
            startActivity(intent)
        }
        fabPecelGablokMbakMulMap =
            findViewById<View>(R.id.fab_pecelgablokmbakmul_map) as FloatingActionButton
        fabPecelGablokMbakMulMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P4GX9M4+3H")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}