package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_wicit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wicit);
    }

    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.button2:
                myIntent = new Intent(activity_wicit.this, father_activity.class);
                break;

            case R.id.button3:
                myIntent = new Intent(activity_wicit.this, activity_causascit.class);
                break;
        }
        startActivity(myIntent);

    }
}