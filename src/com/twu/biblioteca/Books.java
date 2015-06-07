package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    public ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public Books(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    @Override
    public String toString() {
        String list ="";
        for(Book book : listOfBooks){
            list = list + book.getBookDetails() + "\n";
        }
        return list;
    }
}
