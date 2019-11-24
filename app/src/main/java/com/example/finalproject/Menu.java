package com.example.finalproject;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment {


    private ImageButton chatBtn,peopleBtn,tournamentBtn,homeBtn;
    private OnItemSelectedListener listener;

    public Menu() {
        // Required empty public constructor
    }

    public interface OnItemSelectedListener {
        public void itemSelected(String link);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu, container, false);


        Activity activity = getActivity();
        if (activity instanceof OnItemSelectedListener) {
            listener = (OnItemSelectedListener) activity;
        } else {
            throw new ClassCastException(activity.toString()
                    + " must implement MyListFragment.OnItemSelectedListener");
        }


        chatBtn = v.findViewById(R.id.chat_btn);
        peopleBtn = v.findViewById(R.id.people_btn);
        tournamentBtn = v.findViewById(R.id.tournament_btn);
        homeBtn = v.findViewById(R.id.home_btn);


        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.itemSelected("chat");
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.itemSelected("home");
            }
        });
        tournamentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.itemSelected("tournament");
            }
        });
        peopleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.itemSelected("people");
            }
        });


        return v;


    }






}
