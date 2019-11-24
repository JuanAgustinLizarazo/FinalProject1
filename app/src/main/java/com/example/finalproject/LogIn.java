package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    private Button checkInBtn;
    private EditText user_Etxt, password_Etxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        checkInBtn = findViewById(R.id.checkIn_btn);
        user_Etxt = findViewById(R.id.userText_txt);
        password_Etxt = findViewById(R.id.passwordText_txt);

        checkInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogIn.this,CheckIn.class);
                startActivity(i);
            }
        });
    }
}
