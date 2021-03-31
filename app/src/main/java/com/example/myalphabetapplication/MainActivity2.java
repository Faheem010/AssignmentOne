package com.example.myalphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name= getIntent().getStringExtra("name").toLowerCase();
        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();
        int id= getResources().getIdentifier(name,"drawable",getPackageName());
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(id);

        int mid= getResources().getIdentifier(name,"raw",getPackageName());
         mp= MediaPlayer.create(getApplicationContext(),mid);
         mp.start();

    }
}