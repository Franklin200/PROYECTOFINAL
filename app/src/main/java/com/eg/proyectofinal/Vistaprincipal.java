package com.eg.proyectofinal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Vistaprincipal extends AppCompatActivity {

    private Button btnregistrarhimnario, btnregistrarautor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistaprincipal);
        btnregistrarhimnario = (Button)findViewById(R.id.btn_registrarhimnario);
        btnregistrarautor = (Button)findViewById(R.id.btn_registrarautor);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnregistrarhimnario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vistaprincipal.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnregistrarautor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vistaprincipal.this,RegistroAutor.class);
                startActivity(intent);
            }
        });
    }

}
