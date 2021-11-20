package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_menu_mp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mp);
    }

    public void onClick(View view) {

        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.imageButton11:
                myIntent = new Intent(activity_menu_mp.this, father2.class);
                break;

            case R.id.imageButton12:
                myIntent = new Intent(activity_menu_mp.this, activity_father_pcit.class);
                break;

            case R.id.button13:
                myIntent = new Intent(activity_menu_mp.this, father_activity.class);
        }
        startActivity(myIntent);

    }
}