package com.example.androidlabs;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class SecondActivity extends ToolBarActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bar();
    }

}