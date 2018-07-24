package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PecelGablokMbakMulActivity extends AppCompatActivity {

    FloatingActionButton fabPecelGablokMbakMulMap;
    TextView textViewPecelGablokMbakMulContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecel_gablok_mbak_mul);

        textViewPecelGablokMbakMulContact = (TextView) findViewById(R.id.textview_pecelgablokmbakmul_contact);
        textViewPecelGablokMbakMulContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "087832758584", null));
                startActivity(intent);
            }
        });

        fabPecelGablokMbakMulMap = (FloatingActionButton) findViewById(R.id.fab_pecelgablokmbakmul_map);
        fabPecelGablokMbakMulMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P4GX9M4+3H");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
