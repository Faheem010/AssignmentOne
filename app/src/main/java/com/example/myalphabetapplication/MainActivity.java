package com.example.myalphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
MediaPlayer alphabetVoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alphabetVoice=MediaPlayer.create(MainActivity.this,R.raw.a);

    }

    public void animation(View view) {
        ImageView imageView=findViewById(R.id.a);

        imageView.animate().alpha(0).setDuration(2000);
    }

    public void playIt(View view) {
        alphabetVoice.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        alphabetVoice.release();
    }
}