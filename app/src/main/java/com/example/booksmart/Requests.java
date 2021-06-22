package com.example.booksmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class Requests extends AppCompatActivity {
private RatingBar RB1;
private EditText ETreq;
private Button btSubmit;
 int rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);
        Intent i=getIntent();
        RB1= findViewById(R.id.ratingBar);
        ETreq= findViewById(R.id.Req);
        btSubmit= findViewById(R.id.btSubmit);
        rate= (int)RB1.getRating();
    }

    public void Submit(View view) {
    }
}