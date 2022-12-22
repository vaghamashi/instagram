package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class search_bar extends AppCompatActivity {

    ImageView backkk , home ,postt , like , accout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bar);

        backkk = findViewById(R.id.to);
        home = findViewById(R.id.home);
        postt = findViewById(R.id.postttt);
        like = findViewById(R.id.like);
        accout = findViewById(R.id.accou);




        backkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(search_bar.this,MainActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(search_bar.this,MainActivity.class);
                startActivity(intent);
            }
        });
        postt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(search_bar.this,reel_page.class);
                startActivity(intent);
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(search_bar.this,reel_page.class);
                startActivity(intent);
            }
        });
        accout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(search_bar.this,account_page.class);
                startActivity(intent);
            }
        });



    }
}