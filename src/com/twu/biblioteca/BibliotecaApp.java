package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.*;

public class BibliotecaApp {
    CheckOutMenu checkOutMenu;
    int choice;
    BibliotecaOutputHandler bibliotecaOutputHandler;
    MainMenu mainMenu;
    Books books;
    ReturnBook returnBook;

    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler, MainMenu mainMenu, Books books, CheckOutMenu checkOutMenu,ReturnBook returnBook) {
        this.bibliotecaOutputHandler = bibliotecaOutputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
        this.checkOutMenu = checkOutMenu;
        this.returnBook = returnBook;
    }

    public void start() {
        do {
            bibliotecaOutputHandler.display(MENU_OPTIONS);
            choice = mainMenu.getChoice(bibliotecaOutputHandler);
            if (choice == 1) {
                PromptForBookName();
                if (checkOutMenu.isInterestedToCheckOut())
                    new CheckOut(bibliotecaOutputHandler, checkOutMenu).DisplayBookListAndGetNameAndCheckOutBook();
            } else if (choice == 3)
                bibliotecaOutputHandler.display(QUIT_MESSAGE);
            else if(choice == 2){
               returnBook.getBookDetails(bibliotecaOutputHandler);
            }
            else

                bibliotecaOutputHandler.display(ERROR_MESSAGE);

        } while (choice != 3);
    }

    private void PromptForBookName() {
        bibliotecaOutputHandler.display(books);
        bibliotecaOutputHandler.display(USER_PROMPT_FOR_CHECKOUT_BOOK);
    }

}
