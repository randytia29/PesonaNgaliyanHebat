package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AyamKemoeldanAngkringanOmBunActivity extends AppCompatActivity {

    FloatingActionButton fabAyamKemoeldanAngkringanOmBunMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam_kemoeldan_angkringan_om_bun);

        fabAyamKemoeldanAngkringanOmBunMap = findViewById(R.id.fab_ayamkemoeldanangkringanombun_map);
        fabAyamKemoeldanAngkringanOmBunMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Ayam Kemoel Om Bun, Jl. Pengilon II, Bringin, Ngaliyan, Kota Semarang, Jawa Tengah 50189");
                Intent indianIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                indianIntent.setPackage("com.google.android.apps.maps");
                startActivity(indianIntent);
            }
        });
    }
}
