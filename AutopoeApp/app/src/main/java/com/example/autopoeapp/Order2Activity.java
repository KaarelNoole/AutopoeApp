package com.example.autopoeapp;

import android.content.Intent;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order2Activity extends AppCompatActivity {

    private Button Motor1, Motor2, Motor3, Pack1, Pack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);

        Motor1=(Button) findViewById(R.id.motor1);
        Motor2=(Button) findViewById(R.id.motor2);
        Motor3=(Button) findViewById(R.id.motor3);
        Pack1=(Button) findViewById(R.id.Pack1);
        Pack2=(Button) findViewById(R.id.Pack2);

        Motor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Motor1.setBackgroundColor(ContextCompat.getColor(Order2Activity.this,R.color.colorPrimary));
                Motor2.setBackgroundResource(android.R.drawable.btn_default);
                Motor3.setBackgroundResource(android.R.drawable.btn_default);

            }
        });

        Motor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Motor2.setBackgroundColor(ContextCompat.getColor(Order2Activity.this,R.color.colorPrimary));
                Motor1.setBackgroundResource(android.R.drawable.btn_default);
                Motor3.setBackgroundResource(android.R.drawable.btn_default);

            }
        });

        Motor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Motor3.setBackgroundColor(ContextCompat.getColor(Order2Activity.this,R.color.colorPrimary));
                Motor1.setBackgroundResource(android.R.drawable.btn_default);
                Motor2.setBackgroundResource(android.R.drawable.btn_default);

            }
        });

        Pack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pack1.setBackgroundColor(ContextCompat.getColor(Order2Activity.this,R.color.colorPrimary));
                Pack2.setBackgroundResource(android.R.drawable.btn_default);

            }
        });

        Pack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pack2.setBackgroundColor(ContextCompat.getColor(Order2Activity.this,R.color.colorPrimary));
                Pack1.setBackgroundResource(android.R.drawable.btn_default);

            }
        });
    }

    public void onOrder2(View view) {
        Intent intent = new Intent(Order2Activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void onBack(View view) {
        finish();
        super.onBackPressed();
    }
}