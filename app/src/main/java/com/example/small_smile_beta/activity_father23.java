package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_father23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father23);
    }
    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.button9:
                myIntent = new Intent(activity_father23.this, activity_father22.class);
                break;

            case R.id.button10:
                myIntent = new Intent(activity_father23.this, activity_father24.class);
                break;
        }
        startActivity(myIntent);

    }
}