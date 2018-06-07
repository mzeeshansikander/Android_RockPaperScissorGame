package com.example.zeeshan.a1playerrockpaperscissorgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ImageView rock = findViewById(R.id.rock);
        ImageView paper = findViewById(R.id.paper);
        ImageView scissor = findViewById(R.id.scissor);
        final TextView select = findViewById(R.id.select);



        //1 is for rock
        //2 is for paper
        //3 is for scissor


        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int computer = (int) (Math.random()*3);
                if (computer == 0){
                    select.setText("Rock");
                    Toast.makeText(GameActivity.this,"Draw", Toast.LENGTH_SHORT).show();
                }else if (computer==1){
                    select.setText("Paper");
                    Toast.makeText(GameActivity.this, "computer  wins", Toast.LENGTH_SHORT).show();
                }else
                {
                    select.setText("Scissor");
                    Toast.makeText(GameActivity.this, name+" Wins", Toast.LENGTH_SHORT).show();
                }

                //Log.e("TAG",computer+"");





            }


        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int computer = (int) (Math.random()*3);
                if (computer == 0){
                    select.setText("Rock");
                }else if (computer==1){
                    select.setText("Paper");
                }else
                {
                    select.setText("Scissor");
                }
                Log.e("TAG",computer+"");


                if (computer == 0){

                    Toast.makeText(GameActivity.this, name+" Wins", Toast.LENGTH_SHORT).show();
                }else if (computer == 1) {
                    Toast.makeText(GameActivity.this, "Draw", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, " Computer Wins", Toast.LENGTH_SHORT).show();
                }




            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int computer = (int) (Math.random()*3);
                if (computer == 0){
                    select.setText("Rock");
                }else if (computer==1){
                    select.setText("Paper");
                }else
                {
                    select.setText("Scissor");
                }

                Log.e("TAG",computer+"");
                if (computer == 0){

                    Toast.makeText(GameActivity.this,"Computer Wins", Toast.LENGTH_SHORT).show();
                }else if (computer == 1) {
                    Toast.makeText(GameActivity.this, name+" Wins", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "Draw", Toast.LENGTH_SHORT).show();
                }




            }
        });
    }
}
