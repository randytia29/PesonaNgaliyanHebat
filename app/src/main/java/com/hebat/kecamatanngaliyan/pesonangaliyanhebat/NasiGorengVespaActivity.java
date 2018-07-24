package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NasiGorengVespaActivity extends AppCompatActivity {

    FloatingActionButton fabNasiGorengVespaMap;
    TextView textViewNasiGorengVespaContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_goreng_vespa);

        textViewNasiGorengVespaContact = (TextView) findViewById(R.id.textview_nasigorengvespa_contact);
        textViewNasiGorengVespaContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085974731616", null));
                startActivity(intent);
            }
        });

        fabNasiGorengVespaMap = (FloatingActionButton) findViewById(R.id.fab_nasigorengvespa_map);
        fabNasiGorengVespaMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Waroeng Scooter, Ngaliyan, Semarang City, Central Java 50181");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
