package com.example.ex1application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public abstract class LeftActivity2 extends SwipeAc {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left2);
    }

    @Override
    protected void onSwipeRight() {
        Intent tela = new Intent(LeftActivity2.this,MainActivity.class);
        startActivity(tela);

    }

    @Override
    protected void onSwipeLeft() {
        Intent tela = new Intent(LeftActivity2.this,MainActivity.class);
        startActivity(tela);
    }
}