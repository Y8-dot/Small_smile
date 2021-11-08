package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class father_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father);

    }
    public void onClick(View view) {
       Intent  myIntent = null;

        switch(view.getId()){

            case R.id.btn6:
                myIntent = new Intent(father_activity.this, father1.class)
                break;

            case R.id.btn8:
                myIntent = new Intent(father_activity.this, father2.class);
                break;

            case R.id.btn9:
                myIntent = new Intent(father_activity.this, MenuActivity.class);
                break;


        }
        startActivity(myIntent);


    }
}