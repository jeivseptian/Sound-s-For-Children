package org.d3ifcool.soundforchildrens.Others;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.d3ifcool.soundforchildrens.R;

public class KategoriBahasaActivity extends AppCompatActivity {
    private ImageView bahasaInggris, bahasaIndonesia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_bahasa);
        getSupportActionBar().hide();
        bahasaInggris = findViewById(R.id.bahasaInggris);
        bahasaIndonesia = findViewById(R.id.bahasaIndonesia);

        bahasaIndonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KategoriBahasaActivity.this, MainActivity.class));
            }
        });

        bahasaInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KategoriBahasaActivity.this, MainActivityBahasaInggris.class));
            }
        });

    }

}
