package com.twu.biblioteca;

import java.io.PrintWriter;

public class BibliotecaApp {
    public int choice;

    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books) {
        choice = mainMenu.getChoice(bibliotecaOutputHandler);

        if (choice == 1)
            bibliotecaOutputHandler.displayListOfBooks(books);
        else
            bibliotecaOutputHandler.displayErrorMessage();
    }

    public static void main(String args[]) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                new BibliotecaOutputHandler(new PrintWriter(System.out)),
                new MainMenu(System.in),
                new Books(BookList.getListOfBooks()));
    }
}
