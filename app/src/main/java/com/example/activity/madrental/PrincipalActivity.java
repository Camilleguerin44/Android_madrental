package com.example.activity.madrental;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    public void onClickbuttonProfil(View view) {
        // affichage de la page détail :
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);



    }
}