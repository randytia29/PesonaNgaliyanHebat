package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

class KulinerActivity : AppCompatActivity() {
    private var cardTahuGimbalBuSiti: CardView? = null
    private var cardAngkringanPingtoEat: CardView? = null
    private var cardNasiGorengWatuLumpang: CardView? = null
    private var cardNasiGorengMasSastro: CardView? = null
    private var cardNasiBebekMudaKangJono: CardView? = null
    private var cardSotoPakSaepul: CardView? = null
    private var cardBelut96: CardView? = null
    private var cardMieBaksoSehati: CardView? = null
    private var cardSambelHuHah: CardView? = null
    private var cardKedaiEsKrim: CardView? = null
    private var cardLeleKetawa: CardView? = null
    private var cardPecelGablokMbakMul: CardView? = null
    private var cardKelapaBakarBuWarsito: CardView? = null
    private var cardSotoKerbaudanNasiPindang: CardView? = null
    private var cardDawetKetanPakAgus: CardView? = null
    private var cardAyamKemoeldanAngkringanOmBun: CardView? = null
    private var cardAngkringanGrilles: CardView? = null
    private var cardCafeSemilir: CardView? = null
    private var cardSevenPavilion: CardView? = null
    private var cardNasiGorengVespa: CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuliner)
        cardTahuGimbalBuSiti = findViewById(R.id.tahuGimbalBuSiti)
        cardTahuGimbalBuSiti?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, TahuGimbalBuSitiActivity::class.java)
            startActivity(intent)
        }
        cardAngkringanPingtoEat = findViewById(R.id.angkringanpingtoeat)
        cardAngkringanPingtoEat?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, AngkringanPingtoEatActivity::class.java)
            startActivity(intent)
        }
        cardNasiGorengWatuLumpang = findViewById(R.id.nasigorengwatulumpang)
        cardNasiGorengWatuLumpang?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, NasiGorengWatuLumpangActivity::class.java)
            startActivity(intent)
        }
        cardNasiGorengMasSastro = findViewById(R.id.nasigorengmassastro)
        cardNasiGorengMasSastro?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, NasiGorengMasSastroActivity::class.java)
            startActivity(intent)
        }
        cardNasiBebekMudaKangJono = findViewById(R.id.nasibebekmudakangjono)
        cardNasiBebekMudaKangJono?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, NasiBebekMudaKangJonoActivity::class.java)
            startActivity(intent)
        }
        cardSotoPakSaepul = findViewById(R.id.sotopaksaepul)
        cardSotoPakSaepul?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, SotoPakSaepulActivity::class.java)
            startActivity(intent)
        }
        cardBelut96 = findViewById(R.id.belut96)
        cardBelut96?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, Belut96Activity::class.java)
            startActivity(intent)
        }
        cardMieBaksoSehati = findViewById(R.id.miebaksosehati)
        cardMieBaksoSehati?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, MieBaksoSehatiActivity::class.java)
            startActivity(intent)
        }
        cardSambelHuHah = findViewById(R.id.sambelhuhah)
        cardSambelHuHah?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, SambelHuHahActivity::class.java)
            startActivity(intent)
        }
        cardKedaiEsKrim = findViewById(R.id.kedaieskrim)
        cardKedaiEsKrim?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, KedaiEsKrimActivity::class.java)
            startActivity(intent)
        }
        cardLeleKetawa = findViewById(R.id.leleketawa)
        cardLeleKetawa?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, LeleKetawaActivity::class.java)
            startActivity(intent)
        }
        cardPecelGablokMbakMul = findViewById(R.id.pecelgablokmbakmul)
        cardPecelGablokMbakMul?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, PecelGablokMbakMulActivity::class.java)
            startActivity(intent)
        }
        cardKelapaBakarBuWarsito = findViewById(R.id.kelapabakarbuwarsito)
        cardKelapaBakarBuWarsito?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, KelapaBakarBuWarsitoActivity::class.java)
            startActivity(intent)
        }
        cardSotoKerbaudanNasiPindang = findViewById(R.id.sotokerbaudannasipindang)
        cardSotoKerbaudanNasiPindang?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, SotoKerbaudanNasiPindangActivity::class.java)
            startActivity(intent)
        }
        cardDawetKetanPakAgus = findViewById(R.id.dawetketanpakagus)
        cardDawetKetanPakAgus?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, DawetKetanPakAgusActivity::class.java)
            startActivity(intent)
        }
        cardAyamKemoeldanAngkringanOmBun = findViewById(R.id.ayamkemoeldanangkringanombun)
        cardAyamKemoeldanAngkringanOmBun?.setOnClickListener {
            val intent =
                Intent(this@KulinerActivity, AyamKemoeldanAngkringanOmBunActivity::class.java)
            startActivity(intent)
        }
        cardAngkringanGrilles = findViewById(R.id.angkringangrilles)
        cardAngkringanGrilles?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, AngkringanGrillesActivity::class.java)
            startActivity(intent)
        }
        cardCafeSemilir = findViewById(R.id.cafesemilir)
        cardCafeSemilir?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, CafeSemilirActivity::class.java)
            startActivity(intent)
        }
        cardSevenPavilion = findViewById(R.id.sevenpavilion)
        cardSevenPavilion?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, SevenPavilionActivity::class.java)
            startActivity(intent)
        }
        cardNasiGorengVespa = findViewById(R.id.nasigorengvespa)
        cardNasiGorengVespa?.setOnClickListener {
            val intent = Intent(this@KulinerActivity, NasiGorengVespaActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intentBack = Intent(this@KulinerActivity, MainActivity::class.java)
        startActivity(intentBack)
        finish()
    }
}