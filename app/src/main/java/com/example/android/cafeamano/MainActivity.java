package com.example.android.cafeamano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Grabbing the id of the TextView for all the cases

        final TextView infoAmano = (TextView) findViewById(R.id.text_information);

        //Set the Direction Button
        Button dirAmano = (Button) findViewById(R.id.button_direccion);
        dirAmano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoAmano.setText(R.string.dir);
            }
        });

        //Setting the Hours Button

        Button horarioAmano = (Button) findViewById(R.id.button_horarios);
        horarioAmano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String horario = getResources().getString(R.string.horario);
                infoAmano.setText(horario);
            }
        });

        //Setting the Info Button

        Button informacionAmano = (Button) findViewById(R.id.button_informacion);
        informacionAmano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = getResources().getString(R.string.info);
                infoAmano.setText(info);
            }
        });

    }

}
