package com.example.booksmart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Author_Info extends AppCompatActivity {
    ImageView AuthorBook;
    TextView BookInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author__info);
        Intent i=getIntent();
        AuthorBook=findViewById(R.id.AuthorPic);
        BookInfo=findViewById(R.id.authorInfo);


    }
}