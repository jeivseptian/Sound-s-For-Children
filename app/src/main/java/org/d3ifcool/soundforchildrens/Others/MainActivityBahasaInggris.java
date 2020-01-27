package org.d3ifcool.soundforchildrens.Others;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.d3ifcool.soundforchildrens.Game.GameBahasaInggris.CatGame;
import org.d3ifcool.soundforchildrens.Kuis.BahasaInggris.QuizActivity;
import org.d3ifcool.soundforchildrens.Profile.AboutActivity;
import org.d3ifcool.soundforchildrens.Profile.CreditActivity;
import org.d3ifcool.soundforchildrens.R;
import org.d3ifcool.soundforchildrens.Suara.Inggris.Sounds;

public class MainActivityBahasaInggris extends AppCompatActivity {
    private ImageView permainan;
    private ImageView imageView;
    private ImageView kuis;
    private Button bahasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bahasa_inggris);

        permainan = findViewById(R.id.permainan);
        imageView = findViewById(R.id.suara);
        kuis = findViewById(R.id.kuis);


        permainan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBahasaInggris.this, CatGame.class);
                startActivity(intent);

            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBahasaInggris.this, Sounds.class);
                startActivity(intent);

            }
        });

        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityBahasaInggris.this, QuizActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent intentAbout = new Intent(MainActivityBahasaInggris.this, AboutActivity.class);
                startActivity(intentAbout);
                return true;
            case R.id.credits:
                Intent intentCredit = new Intent(MainActivityBahasaInggris.this, CreditActivity.class);
                startActivity(intentCredit);
                return true;


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainActivityBahasaInggris.this,KategoriBahasaActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}

