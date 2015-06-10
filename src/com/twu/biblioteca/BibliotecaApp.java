package com.twu.biblioteca;

import java.io.PrintWriter;
import java.util.ArrayList;

public class BibliotecaApp {
    public int choice;


    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books) {
        choice = mainMenu.getChoice(bibliotecaOutputHandler);

        if (choice == 1)
            bibliotecaOutputHandler.display(books);
        else
            bibliotecaOutputHandler.displayErrorMessage();
    }

    public static void main(String args[]) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                new BibliotecaOutputHandler(new PrintWriter(System.out)),
                new MainMenu(System.in),
                new Books(getListOfBooks()));
    }
    public static ArrayList<Book> getListOfBooks(){
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("C Balagurusamy","Balagurusamy",1990));
        listOfBooks.add(new Book("C++","Balagurusamy",1995));
        listOfBooks.add(new Book("Java","O'Reilly",2012));
        return listOfBooks;
    }
}
