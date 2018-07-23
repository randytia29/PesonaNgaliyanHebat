package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NasiGorengWatuLumpangActivity extends AppCompatActivity {

    FloatingActionButton fabNasiGorengWatulumpangMap;
    TextView textViewNasiGorengWatulumpangContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_goreng_watu_lumpang);

        textViewNasiGorengWatulumpangContact = (TextView) findViewById(R.id.textview_nasigorengwatulumpang_contact);
        textViewNasiGorengWatulumpangContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081228229737", null));
                startActivity(intent);
            }
        });

        fabNasiGorengWatulumpangMap = (FloatingActionButton) findViewById(R.id.fab_nasigorengwatulumpang_map);
        fabNasiGorengWatulumpangMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P5G2948+5R");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
