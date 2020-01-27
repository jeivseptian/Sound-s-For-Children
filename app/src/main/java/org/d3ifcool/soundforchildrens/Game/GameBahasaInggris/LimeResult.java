package org.d3ifcool.soundforchildrens.Game.GameBahasaInggris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.d3ifcool.soundforchildrens.R;

public class LimeResult extends AppCompatActivity {

    TextView textScreen, textQuestion, textTitle;
    Button txtTitle;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lime_result);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");

        mp = MediaPlayer.create(LimeResult.this, R.raw.applause);
        mp.start();

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (Button) findViewById(R.id.textTitle);


        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);

    }
    public void onClick(View view){
        stopPlaying();
        Intent i = new Intent(LimeResult.this, CowGame.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopPlaying();
    }

    public void stopPlaying(){
        if (mp != null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}

