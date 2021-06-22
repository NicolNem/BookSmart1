package com.example.booksmart;

import android.content.Intent;

public class Screens {
    private Intent i;
    private  String s;

    public Screens(Intent i,String s) {
        this.i = i;
        this.s=s;
    }

    public Intent getIntent() {
        return i;
    }

    public void setIintent(Intent i) {
        this.i = i;
    }

    public String getName() {
        return s;
    }

    public void setName(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Screens{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
