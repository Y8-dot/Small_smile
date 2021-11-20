package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClick(View view){

        Intent myIntent = null;

        switch(view.getId()){
            case R.id.btn2:
                myIntent = new Intent(MenuActivity.this, father_activity.class);
                break;

            case R.id.btn3:
                myIntent = new Intent(MenuActivity.this, child_activity.class);
                break;
        }
        startActivity(myIntent);


    }
}