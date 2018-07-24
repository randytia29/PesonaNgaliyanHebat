package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LeleKetawaActivity extends AppCompatActivity {

    FloatingActionButton fabLeleKetawaMap;
    TextView textViewLeleKetawaContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lele_ketawa);

        textViewLeleKetawaContact = (TextView) findViewById(R.id.textview_leleketawa_contact);
        textViewLeleKetawaContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082134725858", null));
                startActivity(intent);
            }
        });

        fabLeleKetawaMap = (FloatingActionButton) findViewById(R.id.fab_leleketawa_map);
        fabLeleKetawaMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P5G286H+G8M");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
