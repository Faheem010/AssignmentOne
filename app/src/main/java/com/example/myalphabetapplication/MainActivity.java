package com.example.myalphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.listView);
        final ArrayList<String> alphabets=new ArrayList<String>();
        char i='A';
        for (int j = 1; j <27 ; j++,i++) {
            alphabets.add(Character.toString(i));
        }
        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alphabets);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name", alphabets.get(i));
                startActivity(intent);
            }
        });
    }

}