package org.d3ifcool.soundforchildrens.Suara.Indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.d3ifcool.soundforchildrens.Others.KategoriBahasaActivity;
import org.d3ifcool.soundforchildrens.Others.MainActivity;
import org.d3ifcool.soundforchildrens.R;

public class SuaraActivity extends AppCompatActivity {
    private ImageView hewan_binatang;
    private ImageView buah;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SuaraActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suara);

        hewan_binatang = findViewById(R.id.suaraHewan);
        buah = findViewById(R.id.suaraNamaBuah);


        hewan_binatang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaraActivity.this, BinatangHewanIndonesiaActivity.class);
                startActivity(intent);
//                mp.start();
            }
        });

        buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaraActivity.this, BuahActivityIndonesia.class);
                startActivity(intent);
            }
        });


    }
}
