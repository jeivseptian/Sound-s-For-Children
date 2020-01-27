package org.d3ifcool.soundforchildrens.Suara.Inggris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.d3ifcool.soundforchildrens.R;

import java.util.ArrayList;

public class BinatangHewan extends AppCompatActivity {
    private Button button_left;
    private Button button_right;
    private ImageView img;
    private TextView tv_nama;
    private ImageView backgorundchanger1, backgorundchanger2,reset;
    private Button button;
    private int lvl = 0;
    private boolean color = false;
    View view;
    ArrayList<Integer> level = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binatang_hewan);
        getSupportActionBar().setTitle("Animals");

        button_left = findViewById(R.id.btn_left);
        button_right = findViewById(R.id.btn_right);
        img = findViewById(R.id.btnSuara);
        button_left.setVisibility(View.GONE);
        tv_nama = findViewById(R.id.tvNamaBinatang);
        backgorundchanger1 = findViewById(R.id.backgorundchanger1);
        backgorundchanger2 = findViewById(R.id.backgorundchanger2);
        reset = findViewById(R.id.reset);
        button = findViewById(R.id.button);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.colorPrimary);

        backgorundchanger1.setVisibility(View.INVISIBLE);
        backgorundchanger2.setVisibility(View.INVISIBLE);

        level.add(R.drawable.lionn);
        level.add(R.drawable.dog);
        level.add(R.drawable.elephant);
        level.add(R.drawable.eagle);
        level.add(R.drawable.swan);
        level.add(R.drawable.chicken);
        level.add(R.drawable.pig);
        level.add(R.drawable.duck);
        level.add(R.drawable.sheep);
        level.add(R.drawable.cow);
        level.add(R.drawable.snake);
        level.add(R.drawable.cat);

        nama.add("Lion");
        nama.add("Dog");
        nama.add("Elephant");
        nama.add("Eagle");
        nama.add("Swan");
        nama.add("Chicken");
        nama.add("Pig");
        nama.add("Duck");
        nama.add("Sheep");
        nama.add("Cow");
        nama.add("Snake");
        nama.add("Cat");
//
//        suara.add(R.raw.lion_growl);
//        suara.add(R.raw.dog);
//        suara.add(R.raw.elang);
//        suara.add(R.raw.gajah);
//        img.setImageResource(level.get(lvl));
//        img.playSoundEffect(level.get(sound));


        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCheckSound();

                if (lvl >= 0 && lvl <= 10) {
                    lvl++;
                    img.setImageResource(level.get(lvl));
                    tv_nama.setText(nama.get(lvl));
                    button_left.setVisibility(View.VISIBLE);
//                    mp.stop();
//                    Log.d("LVL", "onClick: " + lvl);
                }

                if (lvl == 11) {
                    button_right.setVisibility(View.GONE);
                }

            }

        });

        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCheckSound();
                lvl--;
                img.setImageResource(level.get(lvl));
                tv_nama.setText(nama.get(lvl));
                if (lvl == 0) {
                    button_left.setVisibility(View.GONE);
                    button_right.setVisibility(View.VISIBLE);
                }
                if (lvl >= 1 && lvl <= 10) {
                    button_right.setVisibility(View.VISIBLE);
                }
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lvl == 0) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.lion_growl);
                    mp.start();
                } else if (lvl == 1) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.dog);
                    mp.start();
                } else if (lvl == 2) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.gajah);
                    mp.start();
                } else if (lvl == 3) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.elang);
                    mp.start();
                }else if (lvl == 4){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_angsa);
                    mp.start();
                }else if (lvl == 5){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_ayam);
                    mp.start();
                }else if (lvl == 6){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_babi);
                    mp.start();
                }else if (lvl == 7){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_bebek);
                    mp.start();
                }else if (lvl == 8){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_kambing);
                    mp.start();
                }else if (lvl == 9){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_sapi);
                    mp.start();
                }else if (lvl == 10){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.suara_ular);
                    mp.start();
                }else if (lvl == 11){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BinatangHewan.this, R.raw.kucing_1);
                    mp.start();

                } else {
                    lvl--;
                    img.playSoundEffect(level.get(lvl));
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (color == false){
                    backgorundchanger1.setVisibility(View.INVISIBLE);
                    backgorundchanger2.setVisibility(View.INVISIBLE);
                    color = true;
                }
                else if (color == true){
                    backgorundchanger1.setVisibility(View.VISIBLE);
                    backgorundchanger2.setVisibility(View.VISIBLE);
                    color = false;
                }
            }
        });


    }

    public void GreenColor (View v){
        view.setBackgroundResource(R.color.green);
    }
    public void BlueColor (View v){
        view.setBackgroundResource(R.color.blue);
    }
    public void OrangeColor (View v){
        view.setBackgroundResource(R.color.colorPrimary);
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    public void animation(){
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        img.startAnimation(animation);
    }

    private void mCheckSound() {
        if (mp != null) {
            mp.stop();
        }
    }

    @Override
    public void onBackPressed() {
        if (mp != null) {
            mp.stop();
        }
        Intent intent = new Intent(BinatangHewan.this,Sounds.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
