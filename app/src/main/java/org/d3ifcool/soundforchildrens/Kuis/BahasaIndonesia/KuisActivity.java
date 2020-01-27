package org.d3ifcool.soundforchildrens.Kuis.BahasaIndonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.d3ifcool.soundforchildrens.Kuis.BahasaIndonesia.SoalIndonesia;
import org.d3ifcool.soundforchildrens.Kuis.BahasaInggris.HasilKuisActivity;
import org.d3ifcool.soundforchildrens.Kuis.BahasaInggris.QuizActivity;
import org.d3ifcool.soundforchildrens.R;

public class KuisActivity extends AppCompatActivity {
    private SoalIndonesia mQuestionLibrary = new SoalIndonesia();
    private TextView mScoreView;   // Untuk menampilkan skor saat ini
    private ImageView mQuestionView;  //menampilkan jawaban
    private Button mButtonChoice1; // jawaban 1
    private Button mButtonChoice2; // jawaban 2
    private Button mButtonChoice3; //jawaban 3
    private Button mButtonChoice4; //jawaban 4

    private String mAnswer;  // untuk cek jawaban benar atau tidaknya
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; //

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        getSupportActionBar().setTitle("Kuis");

        mScoreView = findViewById(R.id.score);
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        mButtonChoice4 = findViewById(R.id.choice4);
        updateQuestion();

        updateScore(mScore);
    }

    private void updateQuestion(){
        if(mQuestionNumber<mQuestionLibrary.getLength() ){


            mQuestionView.setImageResource(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Intent intent = new Intent(KuisActivity.this, HasilActivity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
            finish();
        }
    }



    private void updateScore(int point) {
        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer){
            mScore = mScore + 1;
            mp = MediaPlayer.create(KuisActivity.this, R.raw.correct);
            mp.start();
        }else
            mp = MediaPlayer.create(KuisActivity.this, R.raw.incorrect);
        mp.start();

        updateScore(mScore);
        updateQuestion();
    }
}
