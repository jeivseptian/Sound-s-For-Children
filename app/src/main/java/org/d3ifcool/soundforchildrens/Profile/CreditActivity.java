package org.d3ifcool.soundforchildrens.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.d3ifcool.soundforchildrens.R;

public class CreditActivity extends AppCompatActivity {
    private TextView tvCredit;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        getSupportActionBar().setTitle("Credit");

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credit);
        tvCredit = (TextView) findViewById(R.id.tv_credit);
        tvCredit.setText("Thanks to : \n\n"+"Icons by : \n"+"Avocado icon - Icon made by Freepik www.flaticon.com \n"
                +"Hand Click icon - icon made by Smashicon www.flaticon.com\n\n"
                +"Pink Background Text icon - icon made by Angga Risky from https://drive.google.com/file/d/17UR6ZOFDogGF57bMDkXSJqT6Pq7UFXPt/view\n\n"
                +"Male icon - icon made by Freepik www.flaticon.com\n"+"Woman icon - icon made by Freepik www.flaticon.com"
                +"United Kingdom icon - icon made by Freepik www.flaticon.com\n"+"Indonesia icon - icon made by Freepik www.flaticon.com\n"
                +"Banana icon - Icon made by Freepik www.flaticon.com \n"+"Raspberry icon - Icon made by Smashicons www.flaticon.com \n"
        +"Blueberry icon - Icon made by Smashicons www.flaticon.com \n" + "Pumkin icon - Icon made by Smashicons www.flaticon.com \n"
        +"Lime icon - Icon made by Smashicons www.flaticon.com \n" + "Pear icon - Icon made by Smashicons www.flaticon.com \n"
        +"Pineapple icon - Icon made by Smashicons www.flaticon.com \n"+"Cherry icon - Icon made by Smashicons www.flaticon.com \n"
        +"Lemon icon - Icon made by Smashicons www.flaticon.com \n" + "Grape icon - Icon made by Smashicons www.flaticon.com \n"
        +"Strawberry icon - Icon made by Smashicons www.flaticon.com \n"+"Apple icon - Icon made by Smashicons www.flaticon.com \n"
        +"Orange icon - Icon made by Smashicons www.flaticon.com \n"+"Swan icon - Icon made by Smashicons www.flaticon.com \n"
        +"Frog icon - Icon made by Flat Icons www.flaticon.com \n"+"Cow icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Chicken icon - Icon made by Flat Icons www.flaticon.com \n"+"Pig icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Sheep icon - Icon made by Flat Icons www.flaticon.com \n"+"Cat icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Lion icon - Icon made by Flat Icons www.flaticon.com \n"+"Dog icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Elephant icon - Icon made by Flat Icons www.flaticon.com \n"+"Eagle icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Tigger icon - Icon made by Flat Icons www.flaticon.com \n"+"Duck icon - Icon made by Monkik www.flaticon.com \n"
        +"Cricket icon - Icon made by Flat Icons www.flaticon.com \n"+"Snake icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Sound icon - Icon made by Prosymbols www.flaticon.com \n"+"Button - Icon made by Freepik www.flaticon.com \n"
        +"Game Controll icon - Icon made by Smashicons www.flaticon.com \n"+"Leaf icon - Icon made by Good Ware www.flaticon.com \n"
        +"Drop icon - Icon made by Vectors Market www.flaticon.com \n\n"

                +"Sounds by : \n"+"Lion Sound effects obtained from https://www.Zapsplat.com \n"
                +"Sounds Applause 4.WAV by Sandermotions from https://freesound.org/people/Sandermotions/sounds/277019/"
                +"Sounds Bad Beep (Incorrect) by RICHERlandTV ( https://freesound.org/people/RICHERlandTV/sounds/216090/ )\n"
                +"Sounds 8-bit Correct Answer by JapanYoshiTheGamer ( https://freesound.org/people/JapanYoshiTheGamer/sounds/361263/ )\n"
        +"Dog Sound effects obtained from https://www.Zapsplat.com \n"+"Elephant Sound effects obtained from https://www.Zapsplat.com \n"
        +"Eagle Sound effects obtained from https://www.Zapsplat.com \n"+"Swan Sound effects obtained from https://www.Simomot.com \n"
        +"Cat Sound effects obtained from https://www.Zapsplat.com \n" +"Chicken Sound effects obtained from https://www.Simomot.com \n"+"Pig Sound effects obtained from https://www.Simomot.com \n"
        +"Duck Sound effects obtained from https://www.Simomot.com \n"+"Sheep Sound effects obtained from https://www.Simomot.com \n"
        +"Cow Sound effects obtained from https://www.Simomot.com \n"+"Snake Sound effects obtained from https://www.Simomot.com \n");

        tvCredit.startAnimation(animation);
    }
}
