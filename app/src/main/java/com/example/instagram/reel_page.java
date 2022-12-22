package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class reel_page extends AppCompatActivity {

    ImageView reell , home , secrh , like , acuuot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reel_page);

        reell = findViewById(R.id.reel);
        home = findViewById(R.id.home);
        secrh = findViewById(R.id.srch);
        like = findViewById(R.id.like);
        acuuot= findViewById(R.id.accou);




        reell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(reel_page.this,MainActivity.class);
                startActivity(intent);


            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(reel_page.this,MainActivity.class);
                startActivity(intent);


            }
        });
        secrh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(reel_page.this,search_bar.class);
                startActivity(intent);


            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(reel_page.this,like_page.class);
                startActivity(intent);


            }
        });
        acuuot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(reel_page.this,account_page.class);
                startActivity(intent);


            }
        });



    }
}