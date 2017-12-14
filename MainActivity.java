package com.example.alex.finaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }

}


// TODO DONE At least 3 different sounds, 3 images, and 1 animated button
// TODO DONE ListView or GridView of data
// TODO DONE Background music
// TODO DONE Internationalize your app (localization) with two additional language of your choice
// TODO DONE When the app starts up for the first time, display a Splash Screen with some image or logo on it
// TODO DONE Any additional feature of your choice: random dice count generation
