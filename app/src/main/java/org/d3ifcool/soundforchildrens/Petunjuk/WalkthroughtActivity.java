package org.d3ifcool.soundforchildrens.Petunjuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import org.d3ifcool.soundforchildrens.Others.KategoriBahasaActivity;
import org.d3ifcool.soundforchildrens.Others.MainActivity;
import org.d3ifcool.soundforchildrens.R;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class WalkthroughtActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter intro;
    TabLayout tabIndicator;
    Button next;
    int position = 0;
    Button btnGet;
    Animation btnanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (restorePrefData()) {
            //disini ganti jadi MainActivity
            Intent intent = new Intent(WalkthroughtActivity.this, KategoriBahasaActivity.class);
            startActivity(intent);
            finish();
        }
        try {
            InputStream inputStream = WalkthroughtActivity.this.openFileInput("confirm.txt");
            Intent intent = new Intent(WalkthroughtActivity.this, KategoriBahasaActivity.class);
            startActivity(intent);
            finish();
        } catch (FileNotFoundException e) {
            System.out.println("File Tidak Ditemukan");
        }

        setContentView(R.layout.activity_walkthrought);

        next = findViewById(R.id.btn_next);
        tabIndicator = findViewById(R.id.tabLayout);
        btnGet = findViewById(R.id.btn_ayomulai);
        btnanim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btn_intro_anim);

        getSupportActionBar().hide();

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Kuis","Pilih jawaban kuis lalu pertanyaan akan berganti, " +
                "jika benar nilai akan bertambah 1, jika salah nilai tidak akan bertambah.",R.drawable.petunjuk1));
        mList.add(new ScreenItem("Permainan","Permainan ini merupakan permainan susun huruf, " +
                "susunlah huruf dengan benar sesuai dengan gambar yang ada.",R.drawable.petunjuk2));

        //setup Viewpager
        screenPager = findViewById(R.id.screen_viewPager);
        intro = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(intro);

        tabIndicator.setupWithViewPager(screenPager);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()){

                    position++;
                    screenPager.setCurrentItem(position);

                }

                if (position == mList.size()-1){

                    loadLastScreen();
                }

            }
        });

        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size()-1) {
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WalkthroughtActivity.this, KategoriBahasaActivity.class));
                savePrefsData();
                finish();
            }
        });

    }

    private void savePrefsData() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend", true);
        editor.commit();
    }

    private boolean restorePrefData() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
        Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend", false);
        return isIntroActivityOpnendBefore;
    }



    private void loadLastScreen() {

        next.setVisibility(View.GONE);
        btnGet.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.GONE);

        btnGet.setAnimation(btnanim);

    }



}
