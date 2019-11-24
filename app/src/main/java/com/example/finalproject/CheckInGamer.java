package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CheckInGamer extends AppCompatActivity {

    private ImageView lolImgV,dotaImgV;
    private Button continueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_gamer);

        lolImgV = findViewById(R.id.lol_imgV);
        dotaImgV = findViewById(R.id.dota_imgV);
        continueBtn = findViewById(R.id.userCheck_btn);

        boolean[] auxiliar = getIntent().getExtras().getBooleanArray("gamesSelected");

        if (auxiliar[0] == false) {
            lolImgV.setVisibility(0);
            lolImgV.setAlpha((float) 0.4);
        }

        if (auxiliar[1] == false) {
            dotaImgV.setVisibility(0);
            dotaImgV.setAlpha((float) 0.4);

        }

        continueBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(CheckInGamer.this, HomeActivity.class);
                startActivity(i);

            }
        });

    }
}
