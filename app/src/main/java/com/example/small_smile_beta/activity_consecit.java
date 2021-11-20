package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_consecit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consecit);
    }

    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.button5:
                myIntent = new Intent(activity_consecit.this, activity_causascit.class);
                break;

            case R.id.button6:
                myIntent = new Intent(activity_consecit.this, father_activity.class);
                break;
        }
        startActivity(myIntent);

    }
}