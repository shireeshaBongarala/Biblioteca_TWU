package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class BibliotecaApp {
    int choice;
    BibliotecaOutputHandler bibliotecaOutputHandler;
    MainMenu mainMenu;
    Books books;
    public static ArrayList<Book> bookList;


    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books) {
        this.bibliotecaOutputHandler = bibliotecaOutputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
    }

    public static void main(String args[]) {
      new BibliotecaApp(
                new BibliotecaOutputHandler(new PrintStream(System.out)),
                new MainMenu(System.in),
                new Books(initializeListOfBooks())).start();
    }

    public static ArrayList<Book> initializeListOfBooks() {
       bookList = new ArrayList<Book>();
        bookList.add(new Book("C Balagurusamy", "Balagurusamy", 1990));
        bookList.add(new Book("C++", "Balagurusamy", 1995));
        bookList.add(new Book("Java", "O'Reilly", 2012));
        return bookList;
    }

    public void start() {
       HashMap<Integer,MenuOption> menuOption = new HashMap<Integer, MenuOption>();
        menuOption.put(1,new BookListOption(books));
        menuOption.put(2,new QuitOption());
        do {
            bibliotecaOutputHandler.display(Messages.MENU_OPTIONS);
            choice = mainMenu.getChoice(bibliotecaOutputHandler);
            if(menuOption.containsKey(choice)) {
                menuOption.get(choice).performAction(bibliotecaOutputHandler);
            }
            else
                bibliotecaOutputHandler.display(Messages.ERROR_MESSAGE);

        }while(choice != 2);
    }
}
