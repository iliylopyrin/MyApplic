package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton buttonPlay = findViewById(R.id.start);
        buttonPlay.setOnClickListener(listener -> {
            mediaPlayer = MediaPlayer.create(this, R.raw.music);
            mediaPlayer.start();

            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start(); // метод возобновления проигрывания
            }
        });

        FloatingActionButton buttonPause = findViewById(R.id.pause);

        buttonPause.setOnClickListener(listener -> {
            mediaPlayer.pause();
        });



    }

}