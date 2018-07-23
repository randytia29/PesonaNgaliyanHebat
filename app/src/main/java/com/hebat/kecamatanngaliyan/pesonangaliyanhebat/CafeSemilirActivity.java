package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CafeSemilirActivity extends AppCompatActivity {

    FloatingActionButton fabCafeSemilirMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_semilir);

        fabCafeSemilirMap = findViewById(R.id.fab_cafesemilir_map);
        fabCafeSemilirMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Semilir Cafe");
                Intent indianIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                indianIntent.setPackage("com.google.android.apps.maps");
                startActivity(indianIntent);
            }
        });
    }
}
