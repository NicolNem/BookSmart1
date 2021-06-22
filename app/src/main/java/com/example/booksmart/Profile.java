package com.example.booksmart;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class Profile extends AppCompatActivity {
    ImageView ProfilePic;
    EditText ETname;
    EditText ETPassword;
    EditText ETemail;
    EditText ETfavGe;
    Button BTconfirm;
    Button BTcamera;
    Button BtGallery;
    byte[] PicArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent i=getIntent();
        ETname=findViewById(R.id.etName);
        ETPassword=findViewById(R.id.etPass);
        ETemail=findViewById(R.id.etEmail);
        ETfavGe=findViewById(R.id.etFav);
        BTconfirm=findViewById(R.id.btConf);
        ProfilePic=findViewById(R.id.ProfilePic);
        BTcamera=findViewById(R.id.btnCamera);
        BtGallery=findViewById(R.id.btnGallery);

    }


    public void Confirm(View view) {
        Dal dal=new Dal(this);
        dal.adduser_withprofilepic(ETname.getText().toString(),PicArray,ETemail.getText().toString(),ETfavGe.getText().toString(),ETPassword.getText().toString());
        Toast.makeText(this, "profile changed",Toast.LENGTH_LONG).show();
    }

    public void btnCamera(View view) {
        Intent PicInt= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(PicInt,100);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode==100)&&(resultCode== Activity.RESULT_OK))
        {
            Bitmap profilepic=(Bitmap) data.getExtras().get("data");
            ProfilePic.setImageBitmap(profilepic);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            profilepic.compress(Bitmap.CompressFormat.JPEG,100,baos);
            PicArray=baos.toByteArray();

        }
    }
}