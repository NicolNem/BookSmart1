package com.example.booksmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void change1(View view) {
        Intent i=new Intent(this,Questionnaire.class);
        startActivity(i);
    }

    public void change2(View view) {
        Intent i=new Intent(this,Main.class);
        startActivity(i);
    }

    public void Change3(View view) {
        Intent i=new Intent(this,Profile.class);
        startActivity(i);
    }

    public void change4(View view) {
        Intent i=new Intent(this,Recommendations.class);
        startActivity(i);
    }

    public void Change5(View view) {
        Intent i=new Intent(this,Requests.class);
        startActivity(i);
    }

    public void Change6(View view) {
        Intent i=new Intent(this,Search.class);
        startActivity(i);
    }

    public void Change7(View view) {
        Intent i=new Intent(this,Author_Info.class);
        startActivity(i);
    }

    public void change8(View view) {
        Intent i=new Intent(this,Book_Info.class);
        startActivity(i);
    }
}