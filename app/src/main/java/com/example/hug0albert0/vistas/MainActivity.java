package com.example.hug0albert0.vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin,btnValidacion,btnCredenciales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnlogin);
        btnValidacion= findViewById(R.id.btnValidacion);
        btnCredenciales=findViewById(R.id.btnCredenciales);
    }


    public void lanzarlogin(View view) {
        Intent iLogin = new Intent(this, login.class);
        startActivity(iLogin);
    }

    public void lanzarvalidacion(View view)
    {
        Intent iValidacion = new Intent(this, validacion.class);
        startActivity(iValidacion);
    }

    public void lanzarcredenciales(View view)
    {
        Intent iCredenciales = new Intent(this,credenciales.class);
        startActivity(iCredenciales);
    }


    public void lanzarRecuperar(View view)
    {
        Intent iRec = new Intent(this,recuperar.class);
        startActivity(iRec);
    }
}
