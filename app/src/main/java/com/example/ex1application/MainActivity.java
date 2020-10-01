package com.example.ex1application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends SwipeAc {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences;
        sharedPreferences = getSharedPreferences("Arquivo", Context.MODE_PRIVATE);
        SharedPreferences .Editor sharedPref = sharedPreferences.edit();
        sharedPref.putString("SuaVariavel","ValordaTeladeMenu");
        sharedPref.commit();
    }

    @Override
    protected void onSwipeRight() {
        Intent tela = new Intent(MainActivity.this, RightActivity2.class);
        startActivity(tela);
    }

    @Override
    protected void onSwipeLeft() {
        Intent tela = new Intent(MainActivity.this, LeftActivity2.class);
        startActivity(tela);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.adicionar:
                Toast.makeText(getApplicationContext(),"Adicionar",
                        Toast.LENGTH_LONG).show();
                return true;
        }
        return (super.onOptionsItemSelected(item));

    }
}