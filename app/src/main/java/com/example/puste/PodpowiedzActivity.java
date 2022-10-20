package com.example.puste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PodpowiedzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);

        Button przycisk =findViewById(R.id.button);
        przycisk.setOnClickListener(view -> {
            Intent intent = new Intent(PodpowiedzActivity.this,MainActivity.class);
            startActivity(intent);
        });

    }
}