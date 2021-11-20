package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_father24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father24);
    }
    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.button11:
                myIntent = new Intent(activity_father24.this,activity_father23.class);
                break;

            case R.id.button12:
                myIntent = new Intent(activity_father24.this,father_activity.class);
                break;
        }
        startActivity(myIntent);

    }
}