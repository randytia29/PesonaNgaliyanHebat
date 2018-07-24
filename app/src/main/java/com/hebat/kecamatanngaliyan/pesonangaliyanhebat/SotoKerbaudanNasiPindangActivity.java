package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SotoKerbaudanNasiPindangActivity extends AppCompatActivity {

    FloatingActionButton fabSotoKerbaudanNasiPindangMap;
    TextView textViewSotoKerbaudanNasiPindangContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto_kerbaudan_nasi_pindang);

        textViewSotoKerbaudanNasiPindangContact = (TextView) findViewById(R.id.textview_sotokerbaudannasipindang_contact);
        textViewSotoKerbaudanNasiPindangContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085740085265", null));
                startActivity(intent);
            }
        });

        fabSotoKerbaudanNasiPindangMap = findViewById(R.id.fab_sotokerbaudannasipindang_map);
        fabSotoKerbaudanNasiPindangMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Soto Kerbau Dan Pindang Kerbau Mbah Modin");
                Intent indianIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                indianIntent.setPackage("com.google.android.apps.maps");
                startActivity(indianIntent);
            }
        });
    }
}
