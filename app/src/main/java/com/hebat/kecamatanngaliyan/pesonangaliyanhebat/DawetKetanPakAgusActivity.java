package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DawetKetanPakAgusActivity extends AppCompatActivity {

    FloatingActionButton fabDawetKetanPakAgusMap;
    TextView textViewDawetKetanPakAgusContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dawet_ketan_pak_agus);

        textViewDawetKetanPakAgusContact = (TextView) findViewById(R.id.textview_dawetketanpakagus_contact);
        textViewDawetKetanPakAgusContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081325999441", null));
                startActivity(intent);
            }
        });

        fabDawetKetanPakAgusMap = (FloatingActionButton) findViewById(R.id.fab_dawetketanpakagus_map);
        fabDawetKetanPakAgusMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P4GX8QQ+M3V");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
