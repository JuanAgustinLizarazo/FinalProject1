package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity implements Menu.OnItemSelectedListener{

private FrameLayout container;
private People people;
private Tournament tournament;
private Chat chat;
private Home home;
private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        container = findViewById(R.id.frame_container);
        home = new Home();
        chat = new Chat();
        tournament = new Tournament();
        menu = new Menu();
        people = new People();
        getSupportFragmentManager().beginTransaction().add(R.id.frame_container,home).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.menu,menu).commit();

    }


    @Override
    public void itemSelected(String link) {

        switch (link){
            case "home":
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,home).commit();

                break;

            case "chat":
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,chat).commit();
                break;

            case "people":
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,people).commit();
                break;

            case "tournament":
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,tournament).commit();
                break;
        }
    }
}
