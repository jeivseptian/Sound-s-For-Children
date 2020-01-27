package org.d3ifcool.soundforchildrens.Game.GameBahasaIndonesia;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.d3ifcool.soundforchildrens.Others.MainActivity;
import org.d3ifcool.soundforchildrens.Others.MainActivityBahasaInggris;
import org.d3ifcool.soundforchildrens.R;

import androidx.appcompat.app.AppCompatActivity;
import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class SapiResult extends AppCompatActivity {
    TextView textScreen, textQuestion, textTitle;
    Button txtTitle;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapi_result);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");

        mp = MediaPlayer.create(SapiResult.this, R.raw.applause);
        mp.start();

        final KonfettiView konfettiView = findViewById(R.id.viewKonfetti);


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

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (Button) findViewById(R.id.textTitle);


        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopPlaying();
    }

    public void onClick(View view){
        stopPlaying();
        Intent i = new Intent(SapiResult.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void stopPlaying(){
        if (mp != null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
