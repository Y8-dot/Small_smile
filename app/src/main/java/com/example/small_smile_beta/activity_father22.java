package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_father22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father22);
    }
    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.btnnn8:
                myIntent = new Intent(activity_father22.this,father2_1.class);
                break;

            case R.id.btnnn9:
                myIntent = new Intent(activity_father22.this,activity_father23.class);
                break;
        }
        startActivity(myIntent);

    }
}
