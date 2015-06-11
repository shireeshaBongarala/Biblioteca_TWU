package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class BibliotecaApp {
    int choice;
    BibliotecaOutputHandler bibliotecaOutputHandler;
    MainMenu mainMenu;
    Books books;


    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books) {
        this.bibliotecaOutputHandler = bibliotecaOutputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
    }

    public static void main(String args[]) {
      new BibliotecaApp(
                new BibliotecaOutputHandler(new PrintStream(System.out)),
                new MainMenu(System.in),
                new Books(getListOfBooks())).start();
    }

    public static ArrayList<Book> getListOfBooks() {
      ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        listOfBooks.add(new Book("C++", "Balagurusamy", 1995));
        listOfBooks.add(new Book("Java", "O'Reilly", 2012));
        return listOfBooks;
    }

    public void start() {
        bibliotecaOutputHandler.display(Messages.MENU_OPTIONS);
       HashMap<Integer,MenuOption> menuOption = new HashMap<Integer, MenuOption>();
        menuOption.put(1,new BookListOption(books));
        menuOption.put(2,new QuitOption());
        do {
            choice = mainMenu.getChoice(bibliotecaOutputHandler);
            if(menuOption.containsKey(choice)) {
                menuOption.get(choice).performAction(bibliotecaOutputHandler);
            }
            else
                bibliotecaOutputHandler.display(Messages.ERROR_MESSAGE);

        }while(choice != 2);
    }
}
