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

    public void onClick(View view){

        Intent myIntent = null;

        switch(view.getId()){
            case R.id.imageButton2:
                myIntent = new Intent(father_activity.this, activity_wicit.class);
                break;

            case R.id.imageButton6:
                myIntent = new Intent(father_activity.this, activity_father_caries.class);
                break;

            case R.id.imageButton4:
                myIntent = new Intent(father_activity.this, father1.class);
                break;

            case R.id.imageButton5:
                myIntent = new Intent(father_activity.this, activity_father_diagnostic.class);
                break;

            case R.id.imageButton3:
                myIntent = new Intent(father_activity.this, father3.class);
                break;

            case R.id.imageButton7:
                myIntent = new Intent(father_activity.this, activity_menu_mp.class);
                break;

            case R.id.imageButton8:
                myIntent = new Intent(father_activity.this, activity_cepillado.class);
                break;

            case R.id.button8:
                myIntent = new Intent(father_activity.this, MenuActivity.class);
                break;
        }
        startActivity(myIntent);


    }

    }
