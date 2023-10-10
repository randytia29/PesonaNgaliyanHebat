package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val handler = Handler()
        handler.postDelayed({
            val i = Intent(this@SplashScreen, SplashScreen2::class.java)
            startActivity(i)
            finish()
        }, 1500)
    }
}