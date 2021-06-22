package com.example.booksmart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Book_Info extends AppCompatActivity {
     ImageView BookPic;
     TextView BookInfo;
     TextView BookLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book__info);
        Intent i=getIntent();
        BookInfo=findViewById(R.id.BookInfo);
        BookPic=findViewById(R.id.BookImg);
        BookLink=findViewById(R.id.BookLink);
    }
}