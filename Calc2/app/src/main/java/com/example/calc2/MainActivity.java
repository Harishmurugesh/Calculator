package com.example.calc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    static String input = "" , output , finalOutput ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().add(R.id.container2, new Fragment2()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container1, new Fragment1()).commit();
    }
}