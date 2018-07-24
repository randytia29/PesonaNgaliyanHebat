package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AyamKemoeldanAngkringanOmBunActivity extends AppCompatActivity {

    FloatingActionButton fabAyamKemoeldanAngkringanOmBunMap;
    TextView textViewAyamKemoeldanAngkringanOmBunContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam_kemoeldan_angkringan_om_bun);

        textViewAyamKemoeldanAngkringanOmBunContact = (TextView) findViewById(R.id.textview_ayamkemoelombun_contact);
        textViewAyamKemoeldanAngkringanOmBunContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085600352628", null));
                startActivity(intent);
            }
        });

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
