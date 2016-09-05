package icesi.com.climaapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import adapter.AdapterPronosticosClima;
import icesi.com.climaapp.R;

public class MainActivity extends AppCompatActivity {

    //Parametros
    private RecyclerView mRecyclerView;
    private AdapterPronosticosClima adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar el recyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);

        //Setear el layoutManager
        mRecyclerView.setLayoutManager(mLayoutManager);

        String  [] datosClima = {"Jueves: 22c°", "Viernes 35°C", "Sábado 35°C","Domingo 40°C", "Lunes 35°C", "Martes 44°c" ,"Miércoles 45°C"};

        //Inicializar el Adapter con la lista de datos del clima
        adapter = new AdapterPronosticosClima(datosClima);

        //asignar el adapter al RecyclerView
        mRecyclerView.setAdapter(adapter);
    }
}
