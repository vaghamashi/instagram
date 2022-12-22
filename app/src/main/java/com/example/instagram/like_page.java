package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class like_page extends AppCompatActivity {

    ImageView home , sech , post ,acouu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_page);

        home = findViewById(R.id.home);
        sech =  findViewById(R.id.srch);
        post = findViewById(R.id.post);
        acouu =findViewById(R.id.accou);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(like_page.this,MainActivity.class);
                startActivity(intent);
            }
        });
        sech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(like_page.this,search_bar.class);
                startActivity(intent);
            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(like_page.this,reel_page.class);
                startActivity(intent);


            }
        });
        acouu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(like_page.this,account_page.class);
                startActivity(intent);
            }
        });
    }
}