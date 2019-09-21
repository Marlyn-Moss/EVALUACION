package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.evaluacion.MainActivity.nuevoEstudiante;
import static com.example.evaluacion.MainActivity.listEstudiante;
import Entidades.Estudiante;


public class Agregar_Estudiante extends AppCompatActivity {
    Double pparcial;
    Double sparcial;
    Double tparcial;
    Double pprom;
    EditText edtNombre, edtCodigo, edtMateria, edtP_parcial, edtS_parcial, edtT_parcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar__estudiante);
        edtNombre = findViewById(R.id.edtNombre);
        edtCodigo = findViewById(R.id.edtCodigo);
        edtMateria = findViewById(R.id.edtMateria);
        edtP_parcial = findViewById(R.id.edtP_parcial);
        edtS_parcial = findViewById(R.id.edtS_parcial);
        edtT_parcial = findViewById(R.id.edtT_parcial);

    }
    public void Guardar(View view){

        if(edtNombre.getText().toString().isEmpty()){
            Toast.makeText(this,"Incompleto, falta campo NOMBRE!",Toast.LENGTH_LONG).show();
        }
        else if(edtCodigo.getText().toString().isEmpty()){
            Toast.makeText(this,"Incompleto, falta campo CODIGO",Toast.LENGTH_LONG).show();
        }
        else if(edtMateria.getText().toString().isEmpty()){
            Toast.makeText(this,"Incompleto, falta campo MATERIA",Toast.LENGTH_LONG).show();
        }
        else if(edtP_parcial.getText().toString().isEmpty()){
            Toast.makeText(this,"Incompleto, falta campo 1° PARCIAL",Toast.LENGTH_LONG).show();
        }
        else if(edtS_parcial.getText().toString().isEmpty()){
            Toast.makeText(this,"Incompleto, falta campo 2° PARCIAL",Toast.LENGTH_LONG).show();
        }
        else if(edtT_parcial.getText().toString().isEmpty()){
            Toast.makeText(this,"Incompleto, falta campo 3° PARCIAL",Toast.LENGTH_LONG).show();
        }
        else{

            pparcial = Double.valueOf(edtP_parcial.getText().toString()).doubleValue();
            sparcial = Double.valueOf(edtS_parcial.getText().toString()).doubleValue();
            tparcial = Double.valueOf(edtT_parcial.getText().toString()).doubleValue();
            pprom =  (pparcial * 0.3)+(sparcial * 0.3)+(tparcial * 0.4);
            nuevoEstudiante.setNombre(edtNombre.getText().toString());
            nuevoEstudiante.setCoidigo(edtCodigo.getText().toString());
            nuevoEstudiante.setMateria(edtMateria.getText().toString());
            nuevoEstudiante.setParcial1(pparcial);
            nuevoEstudiante.setParcial1(sparcial);
            nuevoEstudiante.setParcial1(tparcial);
            nuevoEstudiante.setPromedio(pprom);
            listEstudiante.add(nuevoEstudiante);
            nuevoEstudiante = new Estudiante();

            Toast.makeText(this,"Formulario Completado con Exito!!",Toast.LENGTH_LONG).show();

        }
        finish();

    }
}
