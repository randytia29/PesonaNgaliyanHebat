package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen3)
        val handler = Handler()
        handler.postDelayed({
            val i = Intent(this@SplashScreen3, MainActivity::class.java)
            startActivity(i)
            finish()
        }, 1500)
    }
}