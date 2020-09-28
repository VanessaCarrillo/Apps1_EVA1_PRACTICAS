package com.example.eva1_7_eventos;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    Button btninlistener, btnClaseAnonima; //Se declaran las variables para poder usarlas
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninlistener = findViewById(R.id.btninlistener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);

        btninlistener.setOnClickListener(this);

        View.OnClickListener miClicLis = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Por clase anonima2", Toast.LENGTH_SHORT).show(); //TOAST

            }
        }


        //Extrae el contexto del mainactivity y poder
        //usarlo en el siguente override junto al toast
        //final Context context = getApplicationContext();

        btnClaseAnonima.setOnClickListener(miClicLis);/*(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //Tambien se puede usar el contexto de esta forma, siempre
                        //que se requiera interactuar con la interfaz grafica, se necesita contexto
                        //de ser como la forma anterior tendria un "context" en vez de un "getapplicationcontext""
                        Toast.makeText(getApplicationContext(), "Holaaa mundo!!!", Toast.LENGTH_SHORT).show(); //TOAST
                    }
                }
        );*/

    }

    //EVENTO CLICK, Se utiliza el TOAST
    public void miClick(View v){
        Toast.makeText(this, "Holaaa !!!", Toast.LENGTH_SHORT).show();
        Log.wtf("MENSAJE", "FALLA CATASTROFICA");

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "EVENTO POR INTERFAZ", Toast.LENGTH_SHORT).show();

    }
}