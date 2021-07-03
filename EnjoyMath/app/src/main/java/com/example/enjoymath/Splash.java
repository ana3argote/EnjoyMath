package com.example.enjoymath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}