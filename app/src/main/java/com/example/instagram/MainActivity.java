package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView send , srchh , postt,likee,acoo , story_onee , stroy_twoo , stroy_therrr;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        send = findViewById(R.id.sendmeg);
        srchh = findViewById(R.id.srecheee);
        postt = findViewById(R.id.post);
        likee = findViewById(R.id.like);
        acoo = findViewById(R.id.accou);
        story_onee = findViewById(R.id.story_one);
        stroy_twoo = findViewById(R.id.story_two);
        stroy_therrr = findViewById(R.id.story_therr);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this,second_page.class);
                startActivity(intent);
            }
        });

        srchh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this,search_bar .class);
                startActivity(intent);
            }
        });
        postt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,reel_page.class);
                startActivity(intent);
            }
        });
        likee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,like_page.class);
                startActivity(intent);
            }
        });
        acoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,account_page.class);
                startActivity(intent);

            }
        });
        story_onee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,strory_one.class);
                startActivity(intent);

            }
        });

        stroy_twoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,story_two.class);
                startActivity(intent);
            }
        });
        stroy_therrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,story_therr.class);
                startActivity(intent);
            }
        });



    }
}