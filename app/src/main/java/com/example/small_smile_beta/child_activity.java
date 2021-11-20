package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class child_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
    }

    public void onClick(View view){

        Intent myIntent = null;

        switch (view.getId()){
            case R.id.imageButton:
                myIntent = new Intent(child_activity.this, activity_child3.class);
                break;


            case R.id.imageButton9:
                myIntent = new Intent(child_activity.this, activity_child2.class);
                break;

            case R.id.button7:
                myIntent = new Intent(child_activity.this,MenuActivity.class);
                break;

            case R.id.imageButton10:
                myIntent = new Intent(child_activity.this, activity_child4.class);
                break;
        }
        startActivity(myIntent);

    }
}