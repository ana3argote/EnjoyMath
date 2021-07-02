package com.example.enjoymath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class prueba extends AppCompatActivity {

    private ImageView Hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        Hola = findViewById(R.id.imgLoki);
    }
}