package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KedaiEsKrimActivity extends AppCompatActivity {

    FloatingActionButton fabKedaiEsKrimMap;
    TextView textViewKedaiEsKrimContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedai_es_krim);

        textViewKedaiEsKrimContact = (TextView) findViewById(R.id.textview_kedaieskrim_contact);
        textViewKedaiEsKrimContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082323675807", null));
                startActivity(intent);
            }
        });

        fabKedaiEsKrimMap = (FloatingActionButton) findViewById(R.id.fab_kedaieskrim_map);
        fabKedaiEsKrimMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P5G285F+35");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
