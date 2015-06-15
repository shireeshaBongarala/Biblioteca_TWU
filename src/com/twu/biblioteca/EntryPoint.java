package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class EntryPoint {
    public static ArrayList<Book> bookList;
    public static ArrayList<Book> checkedOutBookList;

    public static void main(String args[]) {
        CheckOutMenu checkOutMenu = new CheckOutMenu(System.in);
        OutputHandler OutputHandler = new OutputHandler(new PrintStream(System.out));
        MainMenuView mainMenuView = new MainMenuView(System.in);
        checkedOutBookList = new ArrayList<Book>();
        new BibliotecaApp(
                new OutputHandler(new PrintStream(System.out)),
                mainMenuView,
                new Books(initializeListOfBooks()), checkOutMenu, new ReturnBook(System.in), new CheckOut(OutputHandler, checkOutMenu, mainMenuView)).start();
    }

    public static ArrayList<Book> initializeListOfBooks() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        bookList.add(new Book("C++", "Balagurusamy", 1995));
        bookList.add(new Book("Java", "O'Reilly", 2012));
        return bookList;
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public static int getBookListSize() {
        return getBookList().size();
    }
}
