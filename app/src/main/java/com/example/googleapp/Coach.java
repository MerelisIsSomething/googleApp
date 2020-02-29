package com.example.googleapp;

public class Coach {
    String name;
    int picture;
    String description;

    public Coach(String name, String description) {
        this.name = name;
        this.picture  = R.drawable.icon;
        this.description= description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(){}

}

