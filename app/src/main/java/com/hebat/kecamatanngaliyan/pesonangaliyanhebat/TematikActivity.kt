package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class TematikActivity : AppCompatActivity() {
    private var snack: ImageView? = null
    private var bringinBerseri: ImageView? = null
    private var souvenir: ImageView? = null
    private var jambuKris: ImageView? = null
    private var ceriping: ImageView? = null
    private var sulamPita: ImageView? = null
    private var ramahKeluarga: ImageView? = null
    private var olahanGadung: ImageView? = null
    private var asriBerimbang: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tematik)
        snack = findViewById(R.id.kampung_snack)
        snack?.setOnClickListener {
            val intentSnack = Intent(this@TematikActivity, SnackActivity::class.java)
            startActivity(intentSnack)
        }
        bringinBerseri = findViewById(R.id.kampung_bringinberseri)
        bringinBerseri?.setOnClickListener {
            val intentBringinBerseri =
                Intent(this@TematikActivity, BringinBerseriActivity::class.java)
            startActivity(intentBringinBerseri)
        }
        souvenir = findViewById(R.id.kampung_souvenir)
        souvenir?.setOnClickListener {
            val intentSouvenir = Intent(this@TematikActivity, SouvenirActivity::class.java)
            startActivity(intentSouvenir)
        }
        jambuKris = findViewById(R.id.kampung_jambu_kristal)
        jambuKris?.setOnClickListener {
            val intentJambuKris = Intent(this@TematikActivity, JambuKristalActivity::class.java)
            startActivity(intentJambuKris)
        }
        ceriping = findViewById(R.id.kampung_criping)
        ceriping?.setOnClickListener {
            val intentCeriping = Intent(this@TematikActivity, CeripingActivity::class.java)
            startActivity(intentCeriping)
        }
        sulamPita = findViewById(R.id.kampung_sulampita)
        sulamPita?.setOnClickListener {
            val intentSulamPita = Intent(this@TematikActivity, SulamPitaActivity::class.java)
            startActivity(intentSulamPita)
        }
        ramahKeluarga = findViewById(R.id.kampung_ramah_keluarga)
        ramahKeluarga?.setOnClickListener {
            val intentRamahKeluarga =
                Intent(this@TematikActivity, RamahKeluargaActivity::class.java)
            startActivity(intentRamahKeluarga)
        }
        olahanGadung = findViewById(R.id.kampung_olahan_gadung)
        olahanGadung?.setOnClickListener {
            val intentOlahanGadung = Intent(this@TematikActivity, OlahanGadungActivity::class.java)
            startActivity(intentOlahanGadung)
        }
        asriBerimbang = findViewById(R.id.kampung_asri_berimbang)
        asriBerimbang?.setOnClickListener {
            val intentAsriBerimbang =
                Intent(this@TematikActivity, AsriBerimbangActivity::class.java)
            startActivity(intentAsriBerimbang)
        }
    }

    override fun onBackPressed() {
        val intentBack = Intent(this@TematikActivity, MainActivity::class.java)
        startActivity(intentBack)
        finish()
    }
}