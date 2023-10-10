package com.hebat.kecamatanngaliyan.pesonangaliyanhebat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.joooonho.SelectableRoundedImageView

class WisataActivity : AppCompatActivity() {
    private var tamanlele: SelectableRoundedImageView? = null
    private var lembahKlp: SelectableRoundedImageView? = null
    private var indian: SelectableRoundedImageView? = null
    private var kapal: SelectableRoundedImageView? = null
    private var margasatwa: SelectableRoundedImageView? = null
    private var karangjoho: SelectableRoundedImageView? = null
    private var kaliancar: SelectableRoundedImageView? = null
    private var kalipancuran: SelectableRoundedImageView? = null
    private var serendeng: SelectableRoundedImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata)
        tamanlele = findViewById(R.id.tamanlele)
        tamanlele?.setOnClickListener {
            val intentTamanLele = Intent(this@WisataActivity, TamanLeleActivity::class.java)
            startActivity(intentTamanLele)
        }
        lembahKlp = findViewById(R.id.lembahklp)
        lembahKlp?.setOnClickListener {
            val intentLembahKlp = Intent(this@WisataActivity, LembahKalipancurActivity::class.java)
            startActivity(intentLembahKlp)
        }
        indian = findViewById(R.id.indian)
        indian?.setOnClickListener {
            val intentIndian = Intent(this@WisataActivity, IndianActivity::class.java)
            startActivity(intentIndian)
        }
        kapal = findViewById(R.id.kapal)
        kapal?.setOnClickListener {
            val intentKapal = Intent(this@WisataActivity, KapalActivity::class.java)
            startActivity(intentKapal)
        }
        margasatwa = findViewById(R.id.margasatwa)
        margasatwa?.setOnClickListener {
            val intentMargasatwa = Intent(this@WisataActivity, MargasatwaActivity::class.java)
            startActivity(intentMargasatwa)
        }
        karangjoho = findViewById(R.id.karangjoho)
        karangjoho?.setOnClickListener {
            val intentKarangjoho = Intent(this@WisataActivity, KarangjohoActivity::class.java)
            startActivity(intentKarangjoho)
        }
        kaliancar = findViewById(R.id.kaliancar)
        kaliancar?.setOnClickListener {
            val intentKaliancar = Intent(this@WisataActivity, KaliancarActivity::class.java)
            startActivity(intentKaliancar)
        }
        kalipancuran = findViewById(R.id.kalipancuran)
        kalipancuran?.setOnClickListener {
            val intentKalipancuran = Intent(this@WisataActivity, KalipancuranActivity::class.java)
            startActivity(intentKalipancuran)
        }
        serendeng = findViewById(R.id.serendeng)
        serendeng?.setOnClickListener {
            val intentSerendeng = Intent(this@WisataActivity, SerendengActivity::class.java)
            startActivity(intentSerendeng)
        }
    }

    override fun onBackPressed() {
        val intentBack = Intent(this@WisataActivity, MainActivity::class.java)
        startActivity(intentBack)
        finish()
    }
}