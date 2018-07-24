package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SotoPakSaepulActivity extends AppCompatActivity {

    FloatingActionButton fabSotoPakSaepulMap;
    TextView textViewSotoPakSaepulContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto_pak_saepul);

        textViewSotoPakSaepulContact = (TextView) findViewById(R.id.textview_sotopaksaepul_contact);
        textViewSotoPakSaepulContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081215604414", null));
                startActivity(intent);
            }
        });

        fabSotoPakSaepulMap = (FloatingActionButton) findViewById(R.id.fab_sotopaksaepul_map);
        fabSotoPakSaepulMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Permata GardenJl gondorio Barat");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
