package org.d3ifcool.soundforchildrens.Kuis.BahasaIndonesia;

import androidx.appcompat.app.AppCompatActivity;
import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.d3ifcool.soundforchildrens.Others.MainActivity;
import org.d3ifcool.soundforchildrens.Others.MainActivityBahasaInggris;
import org.d3ifcool.soundforchildrens.R;

public class HasilActivity extends AppCompatActivity {
    private Button mainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        getSupportActionBar().setTitle("Score");
        TextView txtScore =  findViewById(R.id.textScore);
        TextView txtHighScore = findViewById(R.id.highscore);
        mainmenu = findViewById(R.id.btn_mainMenu);
        final KonfettiView konfettiView = findViewById(R.id.viewKonfetti);
        getSupportActionBar().setTitle("Hasil Akhir");

        konfettiView.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.RECT, Shape.CIRCLE)
                .addSizes(new Size(12, 5f))
                .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
                .stream(300,500L);


//        konfettiView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//
//        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HasilActivity.this, MainActivity.class));
                finish();
            }
        });


        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Nilai Kamu: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("Nilai Tertinggi: "+highscore);
        else
        {
            txtHighScore.setText("Nilai Kamu: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }

    }

    public void onClick(View view) {
        Intent intent = new Intent(HasilActivity.this, KuisActivity.class);
        startActivity(intent);
        finish();
    }

}

