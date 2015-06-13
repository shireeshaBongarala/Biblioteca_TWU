package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static com.twu.biblioteca.Messages.*;

public class BibliotecaApp {
    CheckOutMenu checkOutMenu;
    int choice;
    BibliotecaOutputHandler bibliotecaOutputHandler;
    MainMenu mainMenu;
    Books books;

    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books, CheckOutMenu checkOutMenu) {
        this.bibliotecaOutputHandler = bibliotecaOutputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
        this.checkOutMenu = checkOutMenu;
    }

    public void start() {
       HashMap<Integer,MenuOption> menuOption = new HashMap<Integer, MenuOption>();
        menuOption.put(1,new BookListOption(books));
        menuOption.put(2,new QuitOption());
        do {
            bibliotecaOutputHandler.display(MENU_OPTIONS);
            choice = mainMenu.getChoice(bibliotecaOutputHandler);
            if(choice == 1) {
                bibliotecaOutputHandler.display(books);
                bibliotecaOutputHandler.display(USER_PROMPT_FOR_CHECKOUT_BOOK);
            }
            else if(choice == 2)
                bibliotecaOutputHandler.display(QUIT_MESSAGE);
            else
                bibliotecaOutputHandler.display(ERROR_MESSAGE);

        }while(choice != 2);
    }
}
