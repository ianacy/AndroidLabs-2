package com.example.androidlabs;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class DadJoke extends ToolBarActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_joke);
        bar();
    }

}