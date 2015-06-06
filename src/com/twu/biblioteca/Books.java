package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    public ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public Books() {
        listOfBooks.add(new Book("C Balagurusamy","Balagurusamy",1990));
        listOfBooks.add(new Book("C++","Balagurusamy",1995));
        listOfBooks.add(new Book("Java","O'Reilly",2012));
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
