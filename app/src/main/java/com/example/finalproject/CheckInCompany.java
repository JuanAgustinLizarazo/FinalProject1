package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CheckInCompany extends AppCompatActivity {

    private EditText nameEtxt,phoneEtxt,mailEtxt,cityEtxt,nitEtxt,postalCodeEtxt,businessEtxt;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_company);

        nameEtxt = findViewById(R.id.name_Etxt);
        phoneEtxt = findViewById(R.id.phone_Etxt);
        mailEtxt= findViewById(R.id.mail_Etxt);
        cityEtxt= findViewById(R.id.city_Etxt);
        nitEtxt= findViewById(R.id.nit_Etxt);
        postalCodeEtxt= findViewById(R.id.postalCode_Etxt);
        businessEtxt= findViewById(R.id.business_Etxt);
        check = findViewById(R.id.checkIn_btn);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CheckInCompany.this, HomeActivity.class);
                startActivity(i);

            }
        });
    }
}
