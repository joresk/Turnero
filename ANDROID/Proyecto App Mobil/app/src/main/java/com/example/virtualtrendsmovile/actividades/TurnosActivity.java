package com.example.virtualtrendsmovile.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.virtualtrendsmovile.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class TurnosActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnos);
        BottomNavigationView nav = findViewById(R.id.btnNavSelector);
        nav.setSelected(true);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.back){
                    startActivity(new Intent(getApplicationContext(), SelectorActivity.class));
                } else if (id==R.id.info) {
                    startActivity(new Intent(getApplicationContext(), ContactoActivity.class));
                }else if (id== R.id.map){
                    startActivity(new Intent(getApplicationContext(), DondeEstamosActivity.class));
                } else if (id==R.id.turn) {
                    startActivity(new Intent(getApplicationContext(), NuestroServicio.class));
                } else if (id==R.id.logout) {
                    startActivity(new Intent(getApplicationContext(), InicioActivity.class));
                }
                return false;
            }
        });

    }
    public void ejecutar_turno(View view){
        Intent intent = new Intent(this, TurneroActivity.class);
        startActivity(intent);
        finish();
    }


}