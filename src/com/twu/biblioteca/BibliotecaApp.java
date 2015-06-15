package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.*;

public class BibliotecaApp {
    CheckOutMenu checkOutMenu;
    int choice;
    outputHandler outputHandler;
    MainMenu mainMenu;
    Books books;
    ReturnBook returnBook;
    CheckOut checkout;

    public BibliotecaApp(outputHandler outputHandler, MainMenu mainMenu, Books books, CheckOutMenu checkOutMenu,ReturnBook returnBook,CheckOut checkOut) {
        this.outputHandler = outputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
        this.checkOutMenu = checkOutMenu;
        this.returnBook = returnBook;
        this.checkout = checkOut;
    }

    public void start() {
        do {
            outputHandler.display(MENU_OPTIONS);
            choice = mainMenu.getChoice(outputHandler);
                if (choice == 1) {
                PromptForBookName();
                if (checkOutMenu.isInterestedToCheckOut())
                  checkout.ReadBookName();
            }
            else if(choice == 2){
                returnBook.getBookDetails(outputHandler);
            }
            else if (choice == 3)
                outputHandler.display(QUIT_MESSAGE);

            else
                outputHandler.display(ERROR_MESSAGE);

        } while (choice != 3);
    }

    private void PromptForBookName() {
        outputHandler.display(books);
        outputHandler.display(USER_PROMPT_FOR_CHECKOUT_BOOK);
    }

}
