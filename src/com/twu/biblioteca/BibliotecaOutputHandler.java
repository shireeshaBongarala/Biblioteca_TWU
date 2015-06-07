package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaOutputHandler {

    public ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public void displayWelcomeMessage() {
        System.out.print("Welcome to Biblioteca Library Management System");
    }
    public void displayListOfBooks() {
        listOfBooks.add(new Book("C Balagurusamy","Balagurusamy",1990));
        listOfBooks.add(new Book("C++","Balagurusamy",1995));
        listOfBooks.add(new Book("Java","O'Reilly",2012));
        System.out.print(new Books(listOfBooks));
    }

}
