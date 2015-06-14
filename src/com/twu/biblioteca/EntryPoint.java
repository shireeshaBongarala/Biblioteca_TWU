package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class EntryPoint {
    public static ArrayList<Book> bookList;
    public static ArrayList<Book> referenceBookList;

    public static void main(String args[]) {
        new BibliotecaApp(
                new BibliotecaOutputHandler(new PrintStream(System.out)),
                new MainMenu(System.in),
                new Books(initializeListOfBooks()), new CheckOutMenu(System.in),new ReturnBook(System.in)).start();
    }
    public static ArrayList<Book> initializeListOfBooks() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        bookList.add(new Book("C++", "Balagurusamy", 1995));
        bookList.add(new Book("Java", "O'Reilly", 2012));

        referenceBookList = new ArrayList<Book>();
        referenceBookList.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        referenceBookList.add(new Book("C++", "Balagurusamy", 1995));
        referenceBookList.add(new Book("Java", "O'Reilly", 2012));
        return bookList;
    }
}
