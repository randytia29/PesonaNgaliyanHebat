package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NasiBebekMudaKangJonoActivity extends AppCompatActivity {

    FloatingActionButton fabNasiBebekMudaKangJonoMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_bebek_muda_kang_jono);

        fabNasiBebekMudaKangJonoMap = (FloatingActionButton) findViewById(R.id.fab_nasibebekmudakangjono_map);
        fabNasiBebekMudaKangJonoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P5G2948+6WG");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
