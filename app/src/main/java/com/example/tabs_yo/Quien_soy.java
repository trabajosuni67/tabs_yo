package com.example.tabs_yo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class Quien_soy extends Fragment {

    String nom, ape,car, num, passtime;
    TextView ingrenom, ingreape,ingresaid, ingrenum, ingresapass;
    Button nuevo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Datos = inflater.inflate(R.layout.activity_quien_soy, container, false);
        // Se referencias los obbjetos.
        ingrenom = Datos.findViewById(R.id.txtnombre);
        ingreape = Datos.findViewById(R.id.txtApellido);
        ingresaid = Datos.findViewById(R.id.txtcarnet);
        ingrenum = Datos.findViewById(R.id.Txttelefono);
        ingresapass = Datos.findViewById(R.id.txtpastime);
        // Se envian los datos de tipo string a los TextView Con sus id identificados.
        nom = "REBECCA MARISOL ";
        ingrenom.setText(nom);
        ape = "ARGUETA CRUZ ";
        ingreape.setText(ape);
        car = "SMTS089022";
        ingresaid.setText(car);
        num = "+503 77280731";
        ingrenum.setText(num);
        passtime = "Pasar tiempo con mis amigas";
        ingresapass.setText(passtime);
        // Se refenencia el botón con su funcionabilidad.
        nuevo = Datos.findViewById(R.id.mensajerW);
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Se llama el método donde se envían los datos.
                MensajeM();
            }
        });
        // retorna la variable del View Del onCreate.
        return Datos;
    }
    // Se crea un método que almacena los datos del botón.
    public void MensajeM(){
        String message = "Hola, estas disponible.";
        String Minumero = "+50377280731"; //
        Uri Ver = Uri.parse("https://wa.me/" + Minumero + "/?text=" + message );
        Intent Interfaz = new Intent(Intent.ACTION_VIEW, Ver);
        startActivity(Interfaz);

    }

}