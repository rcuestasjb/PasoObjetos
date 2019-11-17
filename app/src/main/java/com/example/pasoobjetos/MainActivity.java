package com.example.pasoobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) Instancionamos un objeto de la clase evento
        final Evento evento1= new Evento("Cinema a la fresca");
        evento1.categoria="Cine";
        evento1.descripcion="Una jornada cinefila";
        evento1.dia="2019-11-17";
        evento1.hora="20:00";
        evento1.id="1";
        evento1.titulo="Cinema a la fresca";

        //3) Definimos el evento clic del del boton pasar parametro
        Button buttonUno = findViewById(R.id.button);
        buttonUno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //4) Serializamos el objeto con el uso de gson
                Gson gson = new Gson();
                String eventoJson = gson.toJson(evento1);
                //5) Pasamos el objeto evento1 como lo haciamos con el parametro mediante el intent
                Intent activity2Intent = new Intent(getApplicationContext(), Activity2.class);
                activity2Intent.putExtra("eventoJson", eventoJson);
                startActivity(activity2Intent);
            }
        });


    }
}
