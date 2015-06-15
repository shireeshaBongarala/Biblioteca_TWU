package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.*;

public class BibliotecaApp {
    CheckOutMenu checkOutMenu;
    int choice;
    OutputHandler OutputHandler;
    MainMenu mainMenu;
    Books books;
    ReturnBook returnBook;
    CheckOut checkout;

    public BibliotecaApp(OutputHandler OutputHandler, MainMenu mainMenu, Books books, CheckOutMenu checkOutMenu,ReturnBook returnBook,CheckOut checkOut) {
        this.OutputHandler = OutputHandler;
        this.mainMenu = mainMenu;
        this.books = books;
        this.checkOutMenu = checkOutMenu;
        this.returnBook = returnBook;
        this.checkout = checkOut;
    }

    public void start() {
        do {
            OutputHandler.display(MENU_OPTIONS);
            choice = mainMenu.getChoice(OutputHandler);
                if (choice == 1) {
                PromptForBookName();
                if (checkOutMenu.isInterestedToCheckOut())
                  checkout.ReadBookName();
            }
            else if(choice == 2){
                returnBook.getBookDetails(OutputHandler);
            }
            else if (choice == 3)
                OutputHandler.display(QUIT_MESSAGE);

            else
                OutputHandler.display(ERROR_MESSAGE);

        } while (choice != 3);
    }

    private void PromptForBookName() {
        OutputHandler.display(books);
        OutputHandler.display(USER_PROMPT_FOR_CHECKOUT_BOOK);
    }
}
