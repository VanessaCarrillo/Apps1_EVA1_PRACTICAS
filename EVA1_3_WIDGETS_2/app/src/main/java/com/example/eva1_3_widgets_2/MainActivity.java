package com.example.eva1_3_widgets_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarar un objeto del mismo tipo de widwet a modificar
    TextView txtVwHolaMundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //no existe la interfaz grafica

        setContentView(R.layout.activity_main);
        //ya existe la interfaz grafica
        //vincular el componente
        txtVwHolaMundo = findViewById(R.id.txtviewdatos);

        txtVwHolaMundo.setText("Mi primer codigo en android!!");
    }
}