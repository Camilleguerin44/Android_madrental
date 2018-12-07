package com.example.activity.madrental;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String Prenom  = "Prénom";
    private static final String Nom = "Nom";
    private static final String Dtn = "Date de naissance";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getBaseContext().getSharedPreferences(Prenom, MODE_PRIVATE);

        //objectif : sauvegarder 1 seule fois le nom et l'age de l'utilisateur

        //pour cela, on commence par regarder si on a déjà des éléments sauvegardés
        if (sharedPreferences.contains(Prenom) && sharedPreferences.contains(Nom) && sharedPreferences.contains(Dtn)) {

            int prenom = sharedPreferences.getInt(Prenom, 0);
            String nom = sharedPreferences.getString(Nom, null);


        } else {
            //si aucun utilisateur n'est sauvegardé, on ajouter [24,florent]
            sharedPreferences
                    .edit()
                    .putInt(Dtn, 24)
                    .putString(Prenom, "florent")
                    .putString(Nom, "Rouxin")
                    .apply();


        }


    }

}