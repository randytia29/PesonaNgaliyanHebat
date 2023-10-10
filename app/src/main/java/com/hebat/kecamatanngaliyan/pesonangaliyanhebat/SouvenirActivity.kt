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

class SouvenirActivity : AppCompatActivity() {
    private var fabSouvenirMap: FloatingActionButton? = null
    private var textViewSouvenirContact1: TextView? = null
    private var textViewSouvenirContact2: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_souvenir)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        initCollapsingToolbar()
        textViewSouvenirContact1 = findViewById<View>(R.id.textview_souvenir_contact1) as TextView
        textViewSouvenirContact1!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "08156660851", null))
            startActivity(intent)
        }
        textViewSouvenirContact2 = findViewById<View>(R.id.textview_souvenir_contact2) as TextView
        textViewSouvenirContact2!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085950720860", null))
            startActivity(intent)
        }
        fabSouvenirMap = findViewById<View>(R.id.fab_souvenir_map) as FloatingActionButton
        fabSouvenirMap!!.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://plus.codes/6P5G2965+R9G")
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
                    collapsingToolbar.title = "Kampung Souvenir"
                    isShow = true
                } else if (isShow) {
                    collapsingToolbar.title = " "
                    isShow = false
                }
            }
        })
    }
}