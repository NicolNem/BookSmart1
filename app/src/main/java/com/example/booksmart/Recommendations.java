package com.example.booksmart;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Recommendations extends AppCompatActivity {
ListView listRec;
ArrayList<Book> arybooks= new ArrayList<Book>();
    private AdapterView.OnItemClickListener RecListner = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           Intent i = new Intent(Recommendations.this,Book_Info.class);
            startActivity(i);
            //Toast.makeText(Recommendations.this,"Book_Info",Toast.LENGTH_LONG).show();
        }
    };
    private AdapterView.OnItemLongClickListener RecLongListner = new AdapterView.OnItemLongClickListener() {
        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, final long id){
            final  String[] shareAry={"Facebook","whatsapp"};
            AlertDialog.Builder adb=new AlertDialog.Builder(Recommendations.this);
            adb.setTitle("share");
            ArrayAdapter<String> arySharing= new ArrayAdapter<String>(Recommendations.this, android.R.layout.simple_list_item_1,shareAry);
            adb.setAdapter(arySharing, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Recommendations.this,shareAry[which],Toast.LENGTH_LONG).show();
                }
            });
            AlertDialog ad=adb.create();
            ad.show();
                    return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);
        Intent i=getIntent();
        listRec=findViewById(R.id.listViewRec);
        getBookData();
        BookAdapter ba=new BookAdapter(this,R.layout.book,arybooks);
        listRec.setAdapter(ba);
        listRec.setOnItemClickListener(RecListner);
        listRec.setOnItemLongClickListener(RecLongListner);
    }

    private void getBookData(){
        Book b=new Book("callmename.png","call me by your name","?",100);
        arybooks.add(b);
        b=new Book("greengables.png","Anne of GreenGables","?",100);
        arybooks.add(b);
         b=new Book("littlewomen.png","Little women","?",100);
        arybooks.add(b);
         b=new Book("percy.png","Percy Jackson","?",100);
        arybooks.add(b);
         b=new Book("selection.png","The Selection","?",100);
        arybooks.add(b);
         b=new Book("sixcrows.png","Six of crows","?",100);
        arybooks.add(b);
        b=new Book("wonder.png","Wonder","?",100);
        arybooks.add(b);
    }
    public class BookAdapter extends ArrayAdapter<Book>{

      private  Context ctx;
      private int BookResourceid;
      private ArrayList<Book> data;

        public BookAdapter( Context context, int resource, ArrayList<Book> objects) {
            super(context, resource, objects);
             this.ctx=context;
             this.BookResourceid=resource;
             this.data=objects;

        }

        @Override

        public View getView(int position,  View convertView,  ViewGroup parent) {
            View v;
            LayoutInflater li=(LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(convertView== null)
                v=li.inflate(this.BookResourceid,null);
            else
                v=convertView;

                   Book b=this.data.get(position);
            ImageView Ivb=(ImageView) v.findViewById(R.id.bookPic);
                   TextView tv1= v.findViewById(R.id.bookName);
                   tv1.setText(b.getBookName());
                   TextView tv2= v.findViewById(R.id.authorName);
            tv2.setText(b.getAuthorName());
                   TextView tv3= v.findViewById(R.id.Length);
            tv3.setText(String.valueOf(b.getLength()));
            AssetManager am= this.ctx.getAssets();
            try {
                InputStream in=am.open("books/"+b.getImgname());
                Drawable dr=Drawable.createFromStream(in,null);
                Ivb.setImageDrawable(dr);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return v;

        }



        @Override
        public int getCount() {
            return data.size();
        }


    }
}
