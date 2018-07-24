package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SambelHuHahActivity extends AppCompatActivity {

    FloatingActionButton fabSambelHuHahMap;
    TextView textViewSambelHuHahContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sambel_hu_hah);

        textViewSambelHuHahContact = (TextView) findViewById(R.id.textview_sambelhuhah_contact);
        textViewSambelHuHahContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081575440000", null));
                startActivity(intent);
            }
        });

        fabSambelHuHahMap = (FloatingActionButton) findViewById(R.id.fab_sambelhuhah_map);
        fabSambelHuHahMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Sambal Hu Hahh");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
