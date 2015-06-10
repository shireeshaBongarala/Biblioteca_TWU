package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    private ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public Books(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    @Override
    public String toString() {
        String list ="";
        for(Book book : listOfBooks){
            list = list + book.toString() + "\n";
        }
        return list;
    }
}
