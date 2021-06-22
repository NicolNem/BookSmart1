package com.example.booksmart;

public class Book {
    private String imgname;
    private String bookName;
    private String authorName;
    private int length;

    public Book(String imgName, String bookName, String authorName,int length )
    {
        this.imgname=imgName;
        this.bookName=bookName;
        this.authorName=authorName;
        this.length=length;

    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName)
    {
        this.bookName=bookName;

    }
    public String getImgname(){
        return imgname;
    }
    public void setImgname(String imgname)
    {
        this.imgname=imgname;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName)
    {
        this.authorName=authorName;
    }
    public int getLength(){
        return length;
    }
    public void setLength(String imgname)
    {
        this.length=length;
    }
    public String toString(){
        return "book{"+
                "imgName="+imgname+'\''+ ",bookNAme="+bookName+'\''+
                ",authorName="+authorName+'\''+",length="+length+'}';
    }
}
