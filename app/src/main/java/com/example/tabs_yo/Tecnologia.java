package com.example.tabs_yo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.fragment.app.Fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class Tecnologia extends Fragment {


    String pseint, python, Csharp, java, Base1;
    TextView pS, py, C, jv, db1;
    Button Contactar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Mostrar=  inflater.inflate(R.layout.activity_tecnologia, container, false);
        // Se referencian aqui.
        pS = Mostrar.findViewById(R.id.txt_pSeint);
        py = Mostrar.findViewById(R.id.txt_python);
        C = Mostrar.findViewById(R.id.txt_Csharp);
        jv = Mostrar.findViewById(R.id.txt_java);
        db1 = Mostrar.findViewById(R.id.txt_SQL);

        // Se referencia el botón
        Contactar = Mostrar.findViewById(R.id.Enviar_Correo);
        // Damos valores tipo sttring a los textview.
        pseint = " pSeint ";
        pS.setText( pseint );
        python = " Python ";
        py.setText( python );
        Csharp = " C# ";
        C.setText( Csharp );
        java = " JAVA ";
        jv.setText( java );
        Base1 = " Mysql y SQL";
        db1.setText( Base1 );

        // Función del botón
        Contactar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // LLamamos al método.
                contactaremail();
            }
        });
        // retorna la variable del View Del onCreate.
        return Mostrar;
    }
    // Se crea un método para el botón.
    // almacena ACTION_SEND que nos permitirá abrir otras apps
    // de donde enviar el mensje.
    public void contactaremail(){
        String Emisor = " Te gustaria trabajar con nosotros ";
        String Cuerpo_Mensaje = " ";
        Intent Ayuda = new Intent(Intent.ACTION_SEND);
        Ayuda.putExtra(Intent.EXTRA_EMAIL, new String[]{"smts083022@ugb.edu.sv"});
        Ayuda.putExtra(Intent.EXTRA_SUBJECT, Emisor);
        Ayuda.putExtra(Intent.EXTRA_TEXT, Cuerpo_Mensaje);
        Ayuda.setType("message/rfc822");
        startActivity(Intent.createChooser(Ayuda, "Ayuda requerida"));
    }
}