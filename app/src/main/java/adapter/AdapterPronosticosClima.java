package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import icesi.com.climaapp.R;

/**
 * Created by 1143847755 on 02/09/2016.
 */
public class AdapterPronosticosClima extends RecyclerView.Adapter <AdapterPronosticosClima.ViewHolder> {

    private String [] datosClima;

    public AdapterPronosticosClima(String[] datosClima)
    {
        this.datosClima = datosClima;
    }

    /**
     * Se "infla" la vista con los elementos del layout que representa cada item del Cardview
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public AdapterPronosticosClima.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Relacionar los elementos graficos del cardview con la clase itemView
        View itemView = LayoutInflater.from( parent.getContext( ) )
                .inflate( R.layout.cardview_pronostico, parent, false );
        //Asignar el view que tiene los cardview a nuestra clase ViewHolder
        ViewHolder viewHolder = new ViewHolder( itemView );
        //retornar nuestro viewHolder
        return viewHolder;
    }

    /**
     * Relacionar los elementos del arreglo con el viewHolder
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(AdapterPronosticosClima.ViewHolder holder, int position)
    {
        holder.descripcionClima.setText ( datosClima[position]);
    }

    /**
     * Clase que representa los atributos del CardView
     */
    class ViewHolder extends  RecyclerView.ViewHolder
    {
        public TextView descripcionClima;

        public ViewHolder(View itemView)
        {
            super(itemView);
            //Inicializar los atributos
            descripcionClima = (TextView)itemView.findViewById(R.id.texto_descripcion_clima);
        }
    }

    @Override
    public int getItemCount()
    {
        return datosClima.length;
    }
}
