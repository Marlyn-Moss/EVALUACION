package Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion.R;

import java.util.List;

import Entidades.Estudiante;

public class AdaptadorEstudiante extends BaseAdapter {
    private List<Estudiante> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;
    public List<Estudiante> GetData(){
        return this.datasource;
    }
    /**
     * Constructor que permite inicializar las variables de la clase
     * @param context
     * @param IdPlantilla
     * @param sources
     */

    public AdaptadorEstudiante(Context context, int IdPlantilla, List<Estudiante> sources){
        //Inicializamos las variables
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }
    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public Estudiante getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        String posicion = Integer.toString(position+1);
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView edtNombre = convertView.findViewById(R.id.tvNombre);
            TextView edtCodigo = convertView.findViewById(R.id.tvcodigo);
            TextView edtMateria = convertView.findViewById(R.id.tvMateria);
            TextView edtPromedio = convertView.findViewById(R.id.tvPromedio);
            TextView edtCorrelativo = convertView.findViewById(R.id.edtcorrelativo);
            //ImageView icono=convertView.findViewById(R.id.icono);

            //Obtenemos el dato a mostrar
            edtNombre.setText(this.datasource.get(position).getNombre());
            edtCodigo.setText(this.datasource.get(position).getCoidigo());
            edtMateria.setText(this.datasource.get(position).getMateria());
            edtPromedio.setText(this.datasource.get(position).getPromedio().toString());
            edtCorrelativo.setText(posicion);
            //icono.setImageResource(this.datasource.get(position).getImg());
        }
        return convertView;
    }


}
