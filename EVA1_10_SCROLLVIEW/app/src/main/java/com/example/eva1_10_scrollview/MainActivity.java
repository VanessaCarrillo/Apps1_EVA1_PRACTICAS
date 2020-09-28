package com.example.eva1_10_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwTexto;
    final String cade ="Yo sé que hay quienes dicen: ¿por qué no canta ahora\n" +
            "\n" +
            "con aquella locura armoniosa de antaño?\n" +
            "\n" +
            "Ésos no ven la obra profunda de la hora,\n" +
            "\n" +
            "la labor del minuto y el prodigio del año.\n" +
            "\n" +
            "Yo, pobre árbol, produje, al amor de la brisa,\n" +
            "\n" +
            "cuando empecé a crecer, un vago y dulce son.\n" +
            "\n" +
            "Pasó ya el tiempo de la juvenil sonrisa:\n" +
            "\n" +
            "¡dejad al huracán mover mi corazón!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwTexto = findViewById(R.id.txtVwTexto);
        txtVwTexto.setText(cade);
    }
}