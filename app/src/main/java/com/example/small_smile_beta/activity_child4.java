package com.example.small_smile_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_child4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child4);


    }

    public void onClick(View view) {
        Intent myIntent;

        switch (view.getId()) {
            case R.id.imageButton13:
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.apple.com/mx/app/divertido-doctor-bucal/id929051850"));
                startActivity(myIntent);
                break;

            case R.id.imageButton14:
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.apple.com/mx/app/mi-diente-mascota-virtual/id1129665919"));
                startActivity(myIntent);
                break;

            case R.id.imageButton15:
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.dentist.care.pocoyo.doctor.kids.games"));
                startActivity(myIntent);
                break;

            case R.id.imageButton16:
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=skidos.preschool.kids.doctor.game"));
                startActivity(myIntent);
                break;

            case R.id.imageButton17:
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bonbongame.crazy.dentist.doctor"));
                startActivity(myIntent);
                break;

            case R.id.imageButton18:
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ru.mimizavr.brush.teeth"));
                startActivity(myIntent);
                break;

        }
    }
}