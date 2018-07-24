package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SevenPavilionActivity extends AppCompatActivity {

    FloatingActionButton fabSevenPavilionMap;
    TextView textViewSevenPavilionContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_pavilion);

        textViewSevenPavilionContact = (TextView) findViewById(R.id.textview_sevenpavilion_contact);
        textViewSevenPavilionContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082133456788", null));
                startActivity(intent);
            }
        });

        fabSevenPavilionMap = (FloatingActionButton) findViewById(R.id.fab_sevenpavilion_map);
        fabSevenPavilionMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Seven Pavillon");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
