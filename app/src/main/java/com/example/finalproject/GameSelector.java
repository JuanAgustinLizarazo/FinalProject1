package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.WHITE;

public class GameSelector extends AppCompatActivity {

    private Button lolBtn,dotaBtn,continueBtn;
    private boolean fg,lg,og,dg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_selector);

        fg = false;
        lg = false;
        og = false;
        dg = false;

        lolBtn = findViewById(R.id.lol_btn);

        dotaBtn = findViewById(R.id.dota_btn);
        continueBtn = findViewById(R.id.continue_btn);


        lolBtn.setOnClickListener(
                new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {
                        if(lolBtn.getAlpha() != (float) 1.0) {
                            lolBtn.setAlpha((float) 1.0);
                            lg = false;
                        }
                        else{
                            lolBtn.setAlpha((float)(0.6));
                            lg = true;
                        }
                    }
                }
        );

        dotaBtn.setOnClickListener(
                new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {
                        if(dotaBtn.getAlpha() != (float) 1.0) {
                            dotaBtn.setAlpha((float) 1.0);
                            dg = false;
                        }
                        else{
                            dotaBtn.setAlpha((float)(0.6));
                            dg = true;
                        }
                    }
                }
        );

        continueBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                boolean[] gamesSelected = new boolean[2];

                gamesSelected[0] = lg;

                gamesSelected[1] = dg;
               Intent i = new Intent(GameSelector.this, CheckInGamer.class);
               i.putExtra("gamesSelected",gamesSelected);
               startActivity(i);
            }
        });
    }





}
