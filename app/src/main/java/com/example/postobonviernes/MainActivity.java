package com.example.postobonviernes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS(VARIABLES)
    EditText cajaHoras;
    TextView cajaResultado;
    Button botonCalcular;
    int horasDigitadas;
    //METODOS(FUNCIONES)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. asocio los atributos a los layout
        cajaHoras=findViewById(R.id.numeroHoras);
        cajaResultado=findViewById(R.id.resultado);
        botonCalcular=findViewById(R.id.botonCalcular);

        //3. utilizo el escuchador de eventos
        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                horasDigitadas=Integer.parseInt(cajaHoras.getText().toString());

                if(horasDigitadas<=40){
                    int salario=horasDigitadas*20000;
                    cajaResultado.setText("Su salario fue de: $"+salario);

                }else {
                    int salarioBase=800000;
                    int numeroHorasExtra=horasDigitadas-40;
                    int salario=salarioBase+(numeroHorasExtra*25000);
                    cajaResultado.setText("Su salario fue de: $"+salario);
                }
            }
        });
    }
}