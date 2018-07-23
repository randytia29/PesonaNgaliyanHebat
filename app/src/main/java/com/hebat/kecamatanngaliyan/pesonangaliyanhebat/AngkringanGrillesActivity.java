package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AngkringanGrillesActivity extends AppCompatActivity {

    FloatingActionButton fabAngkringanGrillesMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkringan_grilles);

        fabAngkringanGrillesMap = findViewById(R.id.fab_angkringangrilles_map);
        fabAngkringanGrillesMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Angkringen GRILES");
                Intent indianIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                indianIntent.setPackage("com.google.android.apps.maps");
                startActivity(indianIntent);
            }
        });
    }
}
