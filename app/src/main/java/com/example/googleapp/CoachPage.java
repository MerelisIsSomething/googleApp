package com.example.googleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CoachPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_page);

        Bundle bundle = getIntent().getExtras();
        String name =(String)bundle.get("name");
    }
}
