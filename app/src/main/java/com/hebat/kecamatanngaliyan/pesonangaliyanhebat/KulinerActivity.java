package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class KulinerActivity extends AppCompatActivity {

    CardView cardTahuGimbalBuSiti, cardAngkringanPingtoEat, cardNasiGorengWatuLumpang, cardNasiGorengMasSastro,
            cardNasiBebekMudaKangJono, cardSotoPakSaepul, cardBelut96, cardMieBaksoSehati, cardSambelHuHah,
            cardKedaiEsKrim, cardLeleKetawa, cardPecelGablokMbakMul, cardKelapaBakarBuWarsito, cardSotoKerbaudanNasiPindang,
            cardDawetKetanPakAgus, cardAyamKemoeldanAngkringanOmBun, cardAngkringanGrilles, cardCafeSemilir,
            cardSevenPavilion, cardNasiGorengVespa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        cardTahuGimbalBuSiti = findViewById(R.id.tahuGimbalBuSiti);
        cardTahuGimbalBuSiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, TahuGimbalBuSitiActivity.class);
                startActivity(intent);
            }
        });

        cardAngkringanPingtoEat = findViewById(R.id.angkringanpingtoeat);
        cardAngkringanPingtoEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, AngkringanPingtoEatActivity.class);
                startActivity(intent);
            }
        });

        cardNasiGorengWatuLumpang = findViewById(R.id.nasigorengwatulumpang);
        cardNasiGorengWatuLumpang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, NasiGorengWatuLumpangActivity.class);
                startActivity(intent);
            }
        });

        cardNasiGorengMasSastro = findViewById(R.id.nasigorengmassastro);
        cardNasiGorengMasSastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, NasiGorengMasSastroActivity.class);
                startActivity(intent);
            }
        });

        cardNasiBebekMudaKangJono = findViewById(R.id.nasibebekmudakangjono);
        cardNasiBebekMudaKangJono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, NasiBebekMudaKangJonoActivity.class);
                startActivity(intent);
            }
        });

        cardSotoPakSaepul = findViewById(R.id.sotopaksaepul);
        cardSotoPakSaepul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, SotoPakSaepulActivity.class);
                startActivity(intent);
            }
        });

        cardBelut96 = findViewById(R.id.belut96);
        cardBelut96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, Belut96Activity.class);
                startActivity(intent);
            }
        });

        cardMieBaksoSehati = findViewById(R.id.miebaksosehati);
        cardMieBaksoSehati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, MieBaksoSehatiActivity.class);
                startActivity(intent);
            }
        });

        cardSambelHuHah = findViewById(R.id.sambelhuhah);
        cardSambelHuHah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, SambelHuHahActivity.class);
                startActivity(intent);
            }
        });

        cardKedaiEsKrim = findViewById(R.id.kedaieskrim);
        cardKedaiEsKrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, KedaiEsKrimActivity.class);
                startActivity(intent);
            }
        });

        cardLeleKetawa = findViewById(R.id.leleketawa);
        cardLeleKetawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, LeleKetawaActivity.class);
                startActivity(intent);
            }
        });

        cardPecelGablokMbakMul = findViewById(R.id.pecelgablokmbakmul);
        cardPecelGablokMbakMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, PecelGablokMbakMulActivity.class);
                startActivity(intent);
            }
        });

        cardKelapaBakarBuWarsito = findViewById(R.id.kelapabakarbuwarsito);
        cardKelapaBakarBuWarsito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, KelapaBakarBuWarsitoActivity.class);
                startActivity(intent);
            }
        });

        cardSotoKerbaudanNasiPindang = findViewById(R.id.sotokerbaudannasipindang);
        cardSotoKerbaudanNasiPindang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, SotoKerbaudanNasiPindangActivity.class);
                startActivity(intent);
            }
        });

        cardDawetKetanPakAgus = findViewById(R.id.dawetketanpakagus);
        cardDawetKetanPakAgus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, DawetKetanPakAgusActivity.class);
                startActivity(intent);
            }
        });

        cardAyamKemoeldanAngkringanOmBun = findViewById(R.id.ayamkemoeldanangkringanombun);
        cardAyamKemoeldanAngkringanOmBun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, AyamKemoeldanAngkringanOmBunActivity.class);
                startActivity(intent);
            }
        });

        cardAngkringanGrilles = findViewById(R.id.angkringangrilles);
        cardAngkringanGrilles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, AngkringanGrillesActivity.class);
                startActivity(intent);
            }
        });

        cardCafeSemilir = findViewById(R.id.cafesemilir);
        cardCafeSemilir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, CafeSemilirActivity.class);
                startActivity(intent);
            }
        });

        cardSevenPavilion = findViewById(R.id.sevenpavilion);
        cardSevenPavilion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, SevenPavilionActivity.class);
                startActivity(intent);
            }
        });

        cardNasiGorengVespa = findViewById(R.id.nasigorengvespa);
        cardNasiGorengVespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KulinerActivity.this, NasiGorengVespaActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(KulinerActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
