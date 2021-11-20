package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_causascit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causascit);
    }

    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.button:
                myIntent = new Intent(activity_causascit.this, activity_wicit.class);
                break;

            case R.id.button4:
                myIntent = new Intent(activity_causascit.this, activity_consecit.class);
                break;
        }
        startActivity(myIntent);

    }
}