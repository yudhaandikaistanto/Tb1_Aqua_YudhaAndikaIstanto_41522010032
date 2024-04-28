package com.example.tugasaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mainactivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void backlogin (View view) {
        Intent intent = new Intent(Mainactivity3.this,Mainactivity2.class);
        startActivity(intent );

    }

    public void login_m (View view) {
        Intent intent = new Intent(Mainactivity3.this,MainActivity5.class);
        startActivity(intent );

    }
}