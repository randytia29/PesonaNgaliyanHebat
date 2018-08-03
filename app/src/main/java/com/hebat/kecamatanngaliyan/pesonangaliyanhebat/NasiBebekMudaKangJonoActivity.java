package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NasiBebekMudaKangJonoActivity extends AppCompatActivity {

    FloatingActionButton fabNasiBebekMudaKangJonoMap;
    TextView textViewNasiBebekMudaKangJonoContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_bebek_muda_kang_jono);

        textViewNasiBebekMudaKangJonoContact = (TextView) findViewById(R.id.textview_nasibebekmudakangjono_contact);
        textViewNasiBebekMudaKangJonoContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085647065290", null));
                startActivity(intent);
            }
        });

        fabNasiBebekMudaKangJonoMap = (FloatingActionButton) findViewById(R.id.fab_nasibebekmudakangjono_map);
        fabNasiBebekMudaKangJonoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Warung Bebek Kang Jono, no. 21,, Jl. Purwoyoso 1C, Purwoyoso, Ngaliyan, Kota Semarang, Jawa Tengah 50184");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
