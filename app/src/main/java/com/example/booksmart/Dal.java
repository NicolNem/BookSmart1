package com.example.booksmart;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Dal extends SQLiteAssetHelper {
    public Dal(Context context) {
        super(context,"BS_User.db",null,1);
    }
    public void adduser(String name,String email, String favGenre,String password){
        SQLiteDatabase db=getWritableDatabase();
        String sql_INSERT= "INSERT INTO Users (name,email,password,fav_genre) values(?,?,?,?)";
        SQLiteStatement statment=db.compileStatement(sql_INSERT);

      statment.bindString(1,name);
      statment.bindString(2,email);
      statment.bindString (3,password);
      statment.bindString(4,favGenre);

    }
    public void adduser_withprofilepic(String name, byte[] img, String email, String favGenre, String password){
        SQLiteDatabase db=getWritableDatabase();
        String sql_INSERT= "INSERT INTO Users (name,pic,email,password,fav_genre) values(?,?,?,?,?)";
        SQLiteStatement statment=db.compileStatement(sql_INSERT);

        statment.bindString(1,name);
        statment.bindBlob(2,img);
        statment.bindString(3,email);
        statment.bindString (4,password);
        statment.bindString(5,favGenre);

    }

}
