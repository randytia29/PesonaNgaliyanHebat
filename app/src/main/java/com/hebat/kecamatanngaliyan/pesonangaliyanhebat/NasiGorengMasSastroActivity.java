package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NasiGorengMasSastroActivity extends AppCompatActivity {

    FloatingActionButton fabNasiGorengMasSastroMap;
    TextView textViewNasiGorengMasSastroContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_goreng_mas_sastro);

        textViewNasiGorengMasSastroContact = (TextView) findViewById(R.id.textview_nasigorengmassastro_contact);
        textViewNasiGorengMasSastroContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081542306103", null));
                startActivity(intent);
            }
        });

        fabNasiGorengMasSastroMap = (FloatingActionButton) findViewById(R.id.fab_nasigorengmassastro_map);
        fabNasiGorengMasSastroMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Nasi Goreng Mas Sastro");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
