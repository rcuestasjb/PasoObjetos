package com.example.pasoobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent myIntent = getIntent(); // Obtiene el intent creado anteriomente
        //String firstKeyName = myIntent.getStringExtra("parametro"); // recoje el valor del parametro
        getIntent().getSerializableExtra("eventoJson");
        final TextView textViewToChange = (TextView) findViewById(R.id.textView2);

        Gson gson = new Gson();
        Evento miEvento = gson.fromJson(getIntent().getStringExtra("eventoJson"), Evento.class);
        textViewToChange.setText(miEvento.getTitulo());
    }
}
