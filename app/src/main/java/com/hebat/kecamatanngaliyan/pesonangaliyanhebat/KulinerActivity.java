package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class KulinerActivity extends AppCompatActivity {

    CardView cardTahuGimbalBuSiti, cardAngkringanPingtoEat;

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

    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(KulinerActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
