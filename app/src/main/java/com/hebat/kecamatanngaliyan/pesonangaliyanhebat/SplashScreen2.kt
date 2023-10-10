package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)
        val handler = Handler()
        handler.postDelayed({
            val i = Intent(this@SplashScreen2, SplashScreen3::class.java)
            startActivity(i)
            finish()
        }, 1500)
    }
}