package com.example.autopoeapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class CarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);


    }

    public void onOpen(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void onOpen1(View view) {
        Intent intent = new Intent(this, Order1Activity.class);
        startActivity(intent);
    }

    public void onOpen2(View view) {
        Intent intent = new Intent(this, Order2Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
                Intent login = new Intent(CarsActivity.this, LoginActivity.class);
                login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(login);
                return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    public void onSettings(MenuItem item) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void onBack(View view) {
        Intent intent = new Intent(this, CarsActivity.class);
        startActivity(intent);
    }

}