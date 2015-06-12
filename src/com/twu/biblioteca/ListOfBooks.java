package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfBooks {
    ArrayList<Book> listOfBooks = new ArrayList<Book>();
    ListOfBooks(){
        listOfBooks.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        listOfBooks.add(new Book("C++", "Balagurusamy", 1995));
        listOfBooks.add(new Book("Java", "O'Reilly", 2012));
    }

    public ArrayList<Book> getListOfBooks(){
        return listOfBooks;
    }
    public void addToList (Book book){
        listOfBooks.add(book);
    }
    public boolean contains(Book book){
        if(listOfBooks.contains(book))
            return true;
        else
            return false;
    }

}
