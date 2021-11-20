package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class father2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father2);
    }

    public void onClick(View view) {
        Intent myIntent = null;

        switch (view.getId()) {
            case R.id.btn13:
                myIntent = new Intent(father2.this, activity_menu_mp.class);
                break;

            case R.id.btn14:
                myIntent = new Intent(father2.this,father2_1.class);
                break;
        }
        startActivity(myIntent);

    }
}