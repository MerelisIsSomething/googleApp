package com.example.googleapp;

import com.example.googleapp.Coach;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CoachListAdapter extends ArrayAdapter {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        String name = getItem(position).getName();
//        String description = getItem(position).getDescription();
        Object name = getItem(position);
        Object description = getItem(position);


        LayoutInflater inflater = LayoutInflater.from(Coach);
        convertView = inflater.inflate(coach, parent, false);

    }


    public CoachListAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
}
