package com.example.ex1application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class RightActivity2 extends SwipeAc {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right2);
        SharedPreferences sharedPreferences;
        sharedPreferences = getSharedPreferences("Arquivo",MODE_PRIVATE);
        String valorDaOutraTela = sharedPreferences.getString("SuaVariavel","default");
        Toast.makeText(getApplicationContext(),valorDaOutraTela,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSwipeRight() {
        Intent tela = new Intent(RightActivity2.this, MainActivity.class);
        startActivity(tela);
    }

    @Override
    protected void onSwipeLeft() {
        Intent tela = new Intent(RightActivity2.this, MainActivity.class);
        startActivity(tela);
    }

    @Override
    public boolean onOptionsSelected(MenuItem item) {
        return false;
    }
}