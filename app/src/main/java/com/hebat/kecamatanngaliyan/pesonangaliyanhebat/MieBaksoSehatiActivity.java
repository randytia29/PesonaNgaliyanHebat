package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MieBaksoSehatiActivity extends AppCompatActivity {

    FloatingActionButton fabMieBaksoSehatiMap;
    TextView textViewMieBaksoSehatiContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mie_bakso_sehati);

        textViewMieBaksoSehatiContact = (TextView) findViewById(R.id.textview_miebaksosehati_contact);
        textViewMieBaksoSehatiContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085842774250", null));
                startActivity(intent);
            }
        });

        fabMieBaksoSehatiMap = (FloatingActionButton) findViewById(R.id.fab_miebaksosehati_map);
        fabMieBaksoSehatiMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Warung Mie Bakso Sehat,i");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
