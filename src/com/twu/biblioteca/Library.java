package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> availableBookList;
    private ArrayList <Book> checkedOutBookList;
    Library(){
        availableBookList = new ArrayList<Book>();
        checkedOutBookList = new ArrayList<Book>();
        checkedOutBookList.add(new Book("Let Us C","balagurusamy",1997));
        availableBookList.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        availableBookList.add(new Book("C++", "Balagurusamy", 1995));
        availableBookList.add(new Book("Java", "O'Reilly", 2012));
    }
    public ArrayList<Book> getAvailableBookList(){
        return availableBookList;
    }

    public boolean addToAvailableBookList(String bookName) {
        for(Book book : checkedOutBookList)
        if (book.getName().equals(bookName)) {
            availableBookList.add(book);
            checkedOutBookList.remove(book);
            return true;
        }
        return false;
    }
}
