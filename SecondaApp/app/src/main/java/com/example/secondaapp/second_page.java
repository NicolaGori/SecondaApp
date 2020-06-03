package com.example.secondaapp;
//@author = Nicola
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        //recuperare l'activity
        Intent intent = getIntent();//prendo l'intent
        Bundle b = intent.getExtras();//prendo tutto il "fagotto"
        String testo = b.getString("chiave");//dentro testo valore della variabile

        //Sostituire la textView
        TextView etichetta = (TextView)findViewById(R.id.txt_BenArrivato);//recupere la textView e sostituire Ben Arrivato
        etichetta.setText(testo);
    }
}
