package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AngkringanPingtoEatActivity extends AppCompatActivity {

    FloatingActionButton fabAngkringanPingtoEatMap;
    TextView textViewAngkringanPingtoEatContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkringan_pingto_eat);

        textViewAngkringanPingtoEatContact = (TextView) findViewById(R.id.textview_angkringanpingtoeat_contact);
        textViewAngkringanPingtoEatContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082220111046", null));
                startActivity(intent);
            }
        });

        fabAngkringanPingtoEatMap = (FloatingActionButton) findViewById(R.id.fab_angkringanpingtoeat_map);
        fabAngkringanPingtoEatMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Angkringan Ping to Eat");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
