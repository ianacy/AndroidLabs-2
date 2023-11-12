package com.example.androidlabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class ToolBarActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void bar() {
        Toolbar toolBar = findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        DrawerLayout drawer = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggleDrawer = new ActionBarDrawerToggle(this,
                drawer, toolBar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggleDrawer);
        toggleDrawer.syncState();
        NavigationView navigationView = findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.firstIcon:
                Intent mainIntent =
                        new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);
                break;
            case R.id.secondIcon:
                Intent secondIntent
                        = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(secondIntent);
                break;
            case R.id.exit:
                finishAffinity();
                break;
            default:
                break;
        }
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String info = "";
        switch (item.getItemId()) {
            case R.id.firstIcon:
                info = "You clicked on item 1";
                break;
            case R.id.secondIcon:
                info = "You clicked on item 2";
                break;
            default:
                break;
        }
        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return true;
    }



}
