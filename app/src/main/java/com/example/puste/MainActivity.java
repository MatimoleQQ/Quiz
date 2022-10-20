package com.example.puste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sprawdzButton ; //Klasa button do tworzenia buttona
        sprawdzButton = findViewById(R.id.buttonSpr);
        // New View na przycisnieciu
        Button podpowiedzButton = findViewById(R.id.button2);
        sprawdzButton.setOnClickListener(view -> {

        sprawdz();

        });
    }
    private boolean sprawdz()
    {
        RadioGroup grupa = findViewById(R.id.radio);
        int idRadio = grupa.getCheckedRadioButtonId();
        if(idRadio== R.id.radioButton3)
        {
            Toast.makeText(MainActivity.this, R.string.poprawne, Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(MainActivity.this, R.string.zle, Toast.LENGTH_SHORT).show();
        };
        return true;
    }
}