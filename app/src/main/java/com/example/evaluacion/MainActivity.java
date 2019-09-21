package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import Entidades.Estudiante;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<Estudiante> listEstudiante;
    public static Estudiante nuevoEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.listEstudiante = new ArrayList<>();
        nuevoEstudiante = new Estudiante();
    }
    public void crearEsudiante(View view){
        Intent ce= new Intent(this,Agregar_Estudiante.class);
        startActivity(ce);
    }
    public void mostrarLista(View view){
        if(listEstudiante==null || listEstudiante.size()==0){
            Toast.makeText(this,"Lista Vacia!!",Toast.LENGTH_LONG).show();
        }else {
            Intent lista=new Intent(this,Lista_Estudiantes.class);
            startActivity(lista);
        }
    }
    public void mostrarDatos(View view){
        Intent vd = new Intent(this,MisDatos.class);
        startActivity(vd);
    }
}
