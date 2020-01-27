package org.d3ifcool.soundforchildrens.Suara.Indonesia;

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

public class BuahActivityIndonesia extends AppCompatActivity {
    private Button button_left;
    private Button button_right;
    private ImageView img;
    private TextView tv_buah;
    private ImageView backgorundchanger1, backgorundchanger2,reset;
    private Button button;
    private boolean color = false;
    private int lvl = 0;
    ArrayList<Integer> level = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    MediaPlayer mp;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_indonesia);
        getSupportActionBar().setTitle("Buah");

        button_left = findViewById(R.id.btn_left);
        button_right = findViewById(R.id.btn_right);
        tv_buah = findViewById(R.id.tvNamaBuah);
        img = findViewById(R.id.btnSuara);
        backgorundchanger1 = findViewById(R.id.backgorundchanger1);
        backgorundchanger2 = findViewById(R.id.backgorundchanger2);
        reset = findViewById(R.id.reset);
        button = findViewById(R.id.button);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.colorPrimary);

        backgorundchanger1.setVisibility(View.INVISIBLE);
        backgorundchanger2.setVisibility(View.INVISIBLE);


        button_left.setVisibility(View.GONE);

        level.add(R.drawable.apple);
        level.add(R.drawable.grapes);
        level.add(R.drawable.banana);
        level.add(R.drawable.avocado);
        level.add(R.drawable.lime);
        level.add(R.drawable.orange);
        level.add(R.drawable.pineapple);
        level.add(R.drawable.strawberry);
        level.add(R.drawable.blueberries);
        level.add(R.drawable.raspberies);
        level.add(R.drawable.pear);
        level.add(R.drawable.cherries);
        level.add(R.drawable.pumpkin);
        level.add(R.drawable.lemon);

        nama.add("Apel");
        nama.add("Anggur");
        nama.add("Pisang");
        nama.add("Alpukat");
        nama.add("Jeruk Nipis");
        nama.add("Jeruk");
        nama.add("Nanas");
        nama.add("Stroberi");
        nama.add("Bluberi");
        nama.add("Rasberi");
        nama.add("Pir");
        nama.add("Ceri");
        nama.add("Labu");
        nama.add("Jeruk Lemon");



        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCheckSound();

                if (lvl >= 0 && lvl <= 10) {
                    lvl++;
                    img.setImageResource(level.get(lvl));
                    tv_buah.setText(nama.get(lvl));
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
                tv_buah.setText(nama.get(lvl));
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
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.apel);
                    mp.start();
                } else if (lvl == 1) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.anggur);
                    mp.start();
                } else if (lvl == 2) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.pisang);
                    mp.start();
                } else if (lvl == 3) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.alpukat);
                    mp.start();
                }else if (lvl == 4){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.jeruk_nipis);
                    mp.start();
                }else if (lvl == 5){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.jeruk);
                    mp.start();
                }else if (lvl == 6){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.nanas);
                    mp.start();
                }else if (lvl == 7){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.stroberi);
                    mp.start();
                }else if (lvl == 8){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.bluberi);
                    mp.start();
                }else if (lvl == 9){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.rasberi);
                    mp.start();
                }else if (lvl == 10){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.pir);
                    mp.start();
                }else if (lvl == 11){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.ceri);
                    mp.start();
                }else if (lvl == 12){
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.labu);
                    mp.start();
                }else if (lvl == 13) {
                    stopPlaying();
                    animation();
                    mp = MediaPlayer.create(BuahActivityIndonesia.this, R.raw.lemon);
                    mp.start();
                }
                else {
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
        Intent intent = new Intent(BuahActivityIndonesia.this,SuaraActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
}


