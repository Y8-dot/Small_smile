package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class father2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father21);
    }

    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.btn15:
                myIntent = new Intent(father2_1.this, father2.class);
                break;

            case R.id.btn16:
                myIntent = new Intent(father2_1.this, activity_father22.class);
                break;
        }
        startActivity(myIntent);

    }
}