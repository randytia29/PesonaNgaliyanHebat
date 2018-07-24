package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KelapaBakarBuWarsitoActivity extends AppCompatActivity {

    FloatingActionButton fabKelapaBakarBuWarsitoMap;
    TextView textViewKelapaBakarBuWarsitoContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelapa_bakar_bu_warsito);

        textViewKelapaBakarBuWarsitoContact = (TextView) findViewById(R.id.textview_kelapabakarbuwarsito_contact);
        textViewKelapaBakarBuWarsitoContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085640921021", null));
                startActivity(intent);
            }
        });

        fabKelapaBakarBuWarsitoMap = (FloatingActionButton) findViewById(R.id.fab_kelapabakarbuwarsito_map);
        fabKelapaBakarBuWarsitoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Kelapa Bakar Ibu Warsito");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
