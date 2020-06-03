package com.example.secondaapp;
//@author = Nicola
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = (EditText)findViewById(R.id.insertName);

        //"Creo" il Bottone
        Button bClick = (Button) findViewById(R.id.buttonCiao); //recuperare il bottone dalla grafica
        //────────────Al Click del Bottone────────────
        //Click
        bClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = name.getText().toString();//getText prende il testo scritto
                //CREO IL MESSAGGIO
                Toast messaggio = Toast.makeText(getApplicationContext(), "Ciao " + nome, Toast.LENGTH_LONG);
                messaggio.show();
            }
        });
    }
    //al click di next
    public void sendMessage(View view){
        Intent intent = new Intent(getApplicationContext(), second_page.class);
        intent.putExtra("chiave", "Ciao");//primo parametro stringa perché è un array associativo, chiave e valore
        startActivity(intent); //avvio l'intent
    }
}
