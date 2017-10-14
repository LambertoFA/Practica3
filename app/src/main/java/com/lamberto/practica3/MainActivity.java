package com.lamberto.practica3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lista;
    private List<Users> usuarios = new ArrayList<>();
    private UsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        setUsuarios();

        lista = (RecyclerView) findViewById(R.id.lista);
        adapter = new UsersAdapter(this,usuarios);

        lista.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        lista.setAdapter(adapter);

    }

    private  void setUsuarios(){
        usuarios.add(new Users("Lamberto Flores","24 años","7861449004"));
        usuarios.add(new Users("Ismael Sandoval","25 años","4433050936"));
        usuarios.add(new Users("Jonathan Alanis","22 años","7861459004"));
        usuarios.add(new Users("Monica soledad ","24 años","7848759004"));
        usuarios.add(new Users("Lourdes del rio","24 años","7861154604"));
        usuarios.add(new Users("Marco Sullivand","24 años","7861448752"));
        usuarios.add(new Users("Rodrigo Arriga ","24 años","7861474859"));
        usuarios.add(new Users("Alejandro del S","24 años","7848515584"));
    }

}
