package com.example.nuevoproyecto;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nuevoproyecto.adaptadores.UsuarioAdaptador;
import com.example.nuevoproyecto.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> listaItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        cargarSeisElementos();
    }

    private void cargarSeisElementos() {
        listaItems.add(new Usuario(
                "https://upload.wikimedia.org/wikipedia/commons/4/42/1977_Reliant_Robin_850_%2814136529926%29_%28cropped%29.jpg",
                "Reliant Robin 850",
                "Año: 1977 | Motor: 850cc 3-Wheel"
        ));
        listaItems.add(new Usuario(
                "https://upload.wikimedia.org/wikipedia/commons/9/93/BMW_Isetta_-_Flickr_-_mick_-_Lumix.jpg",
                "BMW Isetta",
                "Microcoche clásico | Puerta Frontal"
        ));
        listaItems.add(new Usuario(
                "https://upload.wikimedia.org/wikipedia/commons/a/ab/Messerschmitt_Kabinenroller.jpg",
                "Messerschmitt Kabinenroller",
                "Diseño de cabina de avión | 3 Ruedas"
        ));
        listaItems.add(new Usuario(
                "https://upload.wikimedia.org/wikipedia/commons/c/cf/VW_1302_%282013-09-15_2307_Spu%29.JPG",
                "Volkswagen Escarabajo (VW 1302)",
                "Año: 1970 | Icono Automotriz"
        ));
        listaItems.add(new Usuario(
                "https://upload.wikimedia.org/wikipedia/commons/1/12/1925_Ford_Model_T_touring.jpg",
                "Ford Model T",
                "Año: 1925 | Leyenda de la producción en masa"
        ));
        listaItems.add(new Usuario(
                "https://upload.wikimedia.org/wikipedia/commons/5/51/1964_Peel_P50_Blue.jpg",
                "Peel P50",
                "Año: 1964 | El coche de producción más pequeño"
        ));

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(listaItems));
    }
}