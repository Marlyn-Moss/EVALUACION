package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.evaluacion.MainActivity.listEstudiante;
import Adaptador.AdaptadorEstudiante;

import android.os.Bundle;
import android.widget.ListView;

public class Lista_Estudiantes extends AppCompatActivity {
    ListView lstvEstudiante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__estudiantes);
        lstvEstudiante = findViewById(R.id.lstvEstudiantes);
        lstvEstudiante.setAdapter(new AdaptadorEstudiante(this,R.layout.item_estudiante,listEstudiante));
    }
}
