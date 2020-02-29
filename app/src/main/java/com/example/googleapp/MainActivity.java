package com.example.googleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button hello;
    Button meet;
    ListView listView;
    ArrayList<Coach> coaches = new ArrayList<Coach>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.xml_list);
        meet = findViewById(R.id.meet);
        hello = findViewById(R.id.hello);
        coaches.add(new Coach("Coach Shaquan","One of the new additions of the Code Next team, he's a pretty Kool(aid) guy who works well for the students both academically and makes great friendships."));


        CoachListAdapter adapter = new CoachListAdapter(this, android.R.layout.simple_list_item_1,coaches);
        listView.setAdapter(adapter);
    }

    public void changePage(View view) {
        Intent intent;
        int id = view.getId();
        if (id == R.id.hello) {
            intent = new Intent(MainActivity.this, HelloActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.meet){
            intent = new Intent(MainActivity.this, CoachPage.class);
            startActivity(intent);
        }

    }
}
