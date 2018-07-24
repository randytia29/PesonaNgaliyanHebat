package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CafeSemilirActivity extends AppCompatActivity {

    FloatingActionButton fabCafeSemilirMap;
    TextView textViewCafeSemilirContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_semilir);

        textViewCafeSemilirContact = (TextView) findViewById(R.id.textview_cafesemilir_contact);
        textViewCafeSemilirContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082136420224", null));
                startActivity(intent);
            }
        });

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
