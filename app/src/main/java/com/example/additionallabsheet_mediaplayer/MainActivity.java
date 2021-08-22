package com.example.additionallabsheet_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Start(View view){
        if(mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.song);
            mediaPlayer.start();
        }else{
            mediaPlayer.start();

        }

    }
    public void Pause(View view){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }

    }
    public void Stop(View view){
        mediaPlayer.release();
        mediaPlayer = null;

    }
}