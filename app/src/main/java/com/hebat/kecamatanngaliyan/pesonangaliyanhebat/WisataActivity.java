package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.joooonho.SelectableRoundedImageView;

public class WisataActivity extends AppCompatActivity {

    SelectableRoundedImageView tamanlele, lembahKlp, indian, kapal, margasatwa, karangjoho, kaliancar, kalipancuran, serendeng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        tamanlele = findViewById(R.id.tamanlele);
        tamanlele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTamanLele = new Intent(WisataActivity.this, TamanLeleActivity.class);
                startActivity(intentTamanLele);
            }
        });

        lembahKlp = findViewById(R.id.lembahklp);
        lembahKlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLembahKlp = new Intent(WisataActivity.this, LembahKalipancurActivity.class);
                startActivity(intentLembahKlp);
            }
        });

        indian = findViewById(R.id.indian);
        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentIndian = new Intent(WisataActivity.this, IndianActivity.class);
                startActivity(intentIndian);
            }
        });

        kapal = findViewById(R.id.kapal);
        kapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKapal = new Intent(WisataActivity.this, KapalActivity.class);
                startActivity(intentKapal);
            }
        });

        margasatwa = findViewById(R.id.margasatwa);
        margasatwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMargasatwa = new Intent(WisataActivity.this, MargasatwaActivity.class);
                startActivity(intentMargasatwa);
            }
        });

        karangjoho = findViewById(R.id.karangjoho);
        karangjoho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKarangjoho = new Intent(WisataActivity.this, KarangjohoActivity.class);
                startActivity(intentKarangjoho);
            }
        });

        kaliancar = findViewById(R.id.kaliancar);
        kaliancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKaliancar = new Intent(WisataActivity.this, KaliancarActivity.class);
                startActivity(intentKaliancar);
            }
        });

        kalipancuran = findViewById(R.id.kalipancuran);
        kalipancuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKalipancuran = new Intent(WisataActivity.this, KalipancuranActivity.class);
                startActivity(intentKalipancuran);
            }
        });

        serendeng = findViewById(R.id.serendeng);
        serendeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSerendeng = new Intent(WisataActivity.this, SerendengActivity.class);
                startActivity(intentSerendeng);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(WisataActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
