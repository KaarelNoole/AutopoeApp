package com.example.autopoeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class Settings extends AppCompatActivity {

    TextView Language;
    Button btnPoland, btnEnglish, btnEstonia;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // referencing the text and button views
        Language = findViewById(R.id.language);
        btnPoland = findViewById(R.id.btnPoland);
        btnEnglish = findViewById(R.id.btnEnglish);
        btnEstonia = findViewById(R.id.btnEstonia);
        SwitchMaterial switchBtn = findViewById(R.id.switchbtn);
        getSupportActionBar().setTitle("Light Theme Mode vs Night Theme Mode");
        LanguageManager lang = new LanguageManager(this);

        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    buttonView.setText("Night Mode");
                }else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    buttonView.setText("Light Mode");
                }
            }
        });

        btnEnglish.setOnClickListener(view->
        {
            lang.updateResource("en");
            recreate();
        });

        btnPoland.setOnClickListener(view->{
            lang.updateResource("pl");
            recreate();

        });

        btnEstonia.setOnClickListener(view-> {
            lang.updateResource("et");
            recreate();
        });

        findViewById(R.id.btnBck).setOnClickListener(view -> {
            Intent intent = new Intent(Settings.this, CarsActivity.class);
            startActivity(intent);
        });

        boolean isNightModeOn = AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES;
        switchBtn.setChecked(isNightModeOn);

        if (isNightModeOn){
            switchBtn.setText("Night Mode");
        }else{
            switchBtn.setText("Light Mode");
        }
    }
    @Override
    public void recreate() {
        finish();
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

        startActivity(getIntent());
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
}