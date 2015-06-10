package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaApp {
    int choice;
    BibliotecaOutputHandler bibliotecaOutputHandler;
    MainMenu mainMenu;
    Books books;


    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books) {
        this.bibliotecaOutputHandler = bibliotecaOutputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
        start();
    }

    public static void main(String args[]) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                new BibliotecaOutputHandler(new PrintStream(System.out)),
                new MainMenu(System.in),
                new Books(getListOfBooks()));


    }

    public static ArrayList<Book> getListOfBooks() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        listOfBooks.add(new Book("C++", "Balagurusamy", 1995));
        listOfBooks.add(new Book("Java", "O'Reilly", 2012));
        return listOfBooks;
    }

    public void start() {
        choice = mainMenu.getChoice(bibliotecaOutputHandler);
        if (choice == 2) bibliotecaOutputHandler.display(Messages.QUIT_MESSAGE);
        while (choice!=2)
        {
            if (choice == 1)
                bibliotecaOutputHandler.display(books);
            else
                bibliotecaOutputHandler.display(Messages.ERROR_MESSAGE);

            choice = mainMenu.getChoice(bibliotecaOutputHandler);
        }
    }
}
