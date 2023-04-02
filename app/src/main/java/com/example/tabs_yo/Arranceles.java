package com.example.tabs_yo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Arranceles extends Fragment {

    TextView Parvu, escuela, bachi, Uni,Ciclo, Materias;
    Button ugb;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View estudios = inflater.inflate(R.layout.activity_arranceles, container, false);
        // Se referencian los TextView
        Parvu =estudios.findViewById(R.id.txt_Parvu);
        escuela = estudios.findViewById(R.id.txt_escue);
        bachi = estudios.findViewById(R.id.txt_Insti);
        Uni = estudios.findViewById(R.id.txt_Uni);
        Ciclo = estudios.findViewById(R.id.txt_Ciclos);
        Materias = estudios.findViewById(R.id.txt_Materias);
        // Se envían los datos a los textview
        String inicio = " centro escolar  Geremias Ventura";
        Parvu.setText(inicio);
        String secundaría = " centro escolar  Geremias Ventura";
        escuela.setText(secundaría);
        String INGO = "instituto nacional de yamabal INYA";
        bachi.setText(INGO);
        String Meta = "Universidad Gerardo Barrios";
        Uni.setText(Meta);
        String nota = "3";
        Ciclo.setText( nota );
        String numM = "4";
        Materias.setText( numM );
        // Se referencia el botón.
        ugb = estudios.findViewById(R.id.URL);
        ugb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // El botón almacena la función de ir
                // a la URL de la dicha universidad Establecidad.
                Uri nuevo = Uri.parse("https://ugb.edu.sv/");
                Intent ir = new Intent(Intent.ACTION_VIEW, nuevo);
                startActivity(ir);
            }
        });
        //retorna la variable del View Del onCreate.
        return estudios;
    }
}