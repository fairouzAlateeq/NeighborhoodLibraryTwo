package com.ps;

import java.util.Scanner;

public class Book{
    int ID;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    public Book(int ID, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.ID = ID;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }
    @Override
    public String toString() {
        return "ID: " + ID + ", ISBN: " + isbn + ", Title: " + title +
                ", Checked Out: " + isCheckedOut +
                ", Checked Out To: " + (checkedOutTo != null ? checkedOutTo : "N/A");
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public String checkedOut(String name){
        return "";
    }
    public void checkIn(){

    }
    public static void exit(){
        System.out.println("done");
    }
}


// static Vehicle[] inventory = new Vehicle[20];

