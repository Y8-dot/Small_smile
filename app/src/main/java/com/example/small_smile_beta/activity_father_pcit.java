package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_father_pcit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father_pcit);
    }
    public void onClick(View view) {
        Intent myIntent = new Intent(activity_father_pcit.this, father_activity.class);
        startActivity(myIntent);

    }
}