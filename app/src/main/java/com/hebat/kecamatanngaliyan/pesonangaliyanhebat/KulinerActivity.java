package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class KulinerActivity extends AppCompatActivity {

    CardView cardTahuGimbalBuSiti, cardAngkringanPingtoEat, cardNasiGorengWatuLumpang, cardNasiGorengMasSastro,
            cardNasiBebekMudaKangJono, cardSotoPakSaepul, cardBelut96, cardMieBaksoSehati;

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

    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(KulinerActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
