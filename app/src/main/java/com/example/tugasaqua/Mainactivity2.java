package com.example.tugasaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mainactivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void loginb (View view) {
        Intent intent = new Intent(Mainactivity2.this,Mainactivity3.class);
        startActivity(intent );

    }

    public void loginf (View view) {
        Intent intent = new Intent(Mainactivity2.this,Mainactivity4.class);
        startActivity(intent );

    }
}