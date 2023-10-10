package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.AppBarLayout.OnOffsetChangedListener
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView

class OlahanGadungActivity : AppCompatActivity() {
    private var fabOlahanGadungMap: FloatingActionButton? = null
    private var textViewOlahanGadungContact: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olahan_gadung)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        initCollapsingToolbar()
        textViewOlahanGadungContact =
            findViewById<View>(R.id.textview_olahan_gadung_contact) as TextView
        textViewOlahanGadungContact!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "087832553392", null))
            startActivity(intent)
        }
        fabOlahanGadungMap = findViewById<View>(R.id.fab_olahan_gadung_map) as FloatingActionButton
        fabOlahanGadungMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P4GX7WP+975")
            val intent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }

    private fun initCollapsingToolbar() {
        val collapsingToolbar =
            findViewById<View>(R.id.collapsing_toolbar) as CollapsingToolbarLayout
        collapsingToolbar.title = " "
        val appBarLayout = findViewById<View>(R.id.appbar) as AppBarLayout
        appBarLayout.setExpanded(true)

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(object : OnOffsetChangedListener {
            var isShow = false
            var scrollRange = -1
            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.title = "Kampung Olahan Gadung"
                    isShow = true
                } else if (isShow) {
                    collapsingToolbar.title = " "
                    isShow = false
                }
            }
        })
    }
}