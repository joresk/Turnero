package com.example.virtualtrendsmovile.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.virtualtrendsmovile.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        BottomNavigationView nav = findViewById(R.id.btnNavSelector);
        nav.setSelectedItemId(R.id.logout);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.back){

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

    public void launchLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void launchRegisterActivity(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}