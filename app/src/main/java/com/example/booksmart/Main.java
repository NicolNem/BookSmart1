package com.example.booksmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();

        }

    public void mvMenu(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    }
