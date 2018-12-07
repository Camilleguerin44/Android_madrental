package com.example.activity.madrental;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    //Constantes :
    private static final String CHEMIN_FONT = "font/Hansief.otf";


    //Vues
    private TextView textViewLegende = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Police de la page principal

        Typeface typeface = Typeface.createFromAsset(getAssets(), CHEMIN_FONT);
        textViewLegende.setTypeface(typeface);

    }
}
