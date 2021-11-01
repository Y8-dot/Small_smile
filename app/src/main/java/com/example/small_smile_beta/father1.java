package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class father1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father1);

    }
    public void onClick(View view) {
        Intent myIntent = new Intent(father1.this, father_activity.class);
        startActivity(myIntent);

    }
}