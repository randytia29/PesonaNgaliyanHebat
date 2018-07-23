package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DawetKetanPakAgusActivity extends AppCompatActivity {

    FloatingActionButton fabDawetKetanPakAgusMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dawet_ketan_pak_agus);

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
