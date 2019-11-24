package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckIn extends AppCompatActivity {

    private Button continueBtn, gamerBtn,companyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        continueBtn = findViewById(R.id.continue_btn);
        gamerBtn = findViewById(R.id.gamer_btn);
        companyBtn = findViewById(R.id.company_btn);
        continueBtn.setEnabled(false);
        gamerBtn.setOnClickListener(
                new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {

                        if(gamerBtn.getAlpha() != (float) 1.0) {
                            gamerBtn.setAlpha((float) 1.0);
                            continueBtn.setEnabled(false);
                        }
                        else{
                            gamerBtn.setAlpha((float)(0.6));
                            companyBtn.setAlpha((float)(1.0));
                            continueBtn.setEnabled(true);
                        }
                    }
                }
        );
        companyBtn.setOnClickListener(
                new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {
                        if(companyBtn.getAlpha() != (float) 1.0) {
                            companyBtn.setAlpha((float) 1.0);
                            continueBtn.setEnabled(false);

                        }
                        else{
                            companyBtn.setAlpha((float)(0.6));
                            gamerBtn.setAlpha((float)(1.0));
                            continueBtn.setEnabled(true);
                        }
                    }
                }
        );

        continueBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = null;
                if(gamerBtn.getAlpha() == (float) 1.0){
                    i = new Intent(CheckIn.this, CheckInCompany.class);
                }
                else{
                    i = new Intent(CheckIn.this, GameSelector.class);
                }


                startActivity(i);
            }
        });

    }
}
