package com.example.faceofgeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.TextView;


public class TitleScreen extends AppCompatActivity {
    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
        mediaPlayer = MediaPlayer.create(this, R.raw.kenc);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);



    }
    public void goGameScreen(View view){
            Intent gameScreen = new Intent(this, GameScreen.class);
            mediaPlayer.stop();
            mediaPlayer.release();
            startActivity(gameScreen);
        }


    public void goRecordScreen(View view){
        Intent recordScreen = new Intent(this, RecordScreen.class);
        startActivity(recordScreen);
    }


    }

