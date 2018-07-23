package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TahuGimbalBuSitiActivity extends AppCompatActivity {

    FloatingActionButton fabTahuGimbalBuSitiMap;
    TextView textViewTahuGimbalBuSitiContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahu_gimbal_bu_siti);

        textViewTahuGimbalBuSitiContact = (TextView) findViewById(R.id.textview_tahugimbalbusiti_contact);
        textViewTahuGimbalBuSitiContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "0247614721", null));
                startActivity(intent);
            }
        });

        fabTahuGimbalBuSitiMap = (FloatingActionButton) findViewById(R.id.fab_tahugimbalbusiti_map);
        fabTahuGimbalBuSitiMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P5G283W+6HM");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
