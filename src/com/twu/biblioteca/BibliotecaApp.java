package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.*;

public class BibliotecaApp {
    int choice;
    OutputHandler outputHandler;
    InputHandler inputHandler;
    Books books;
    ReturnBook returnBook;
    CheckOut checkout;

    public BibliotecaApp(OutputHandler OutputHandler, InputHandler inputHandler, Books books,ReturnBook returnBook,CheckOut checkOut) {
        this.outputHandler = OutputHandler;
        this.inputHandler = inputHandler;
        this.books = books;

        this.returnBook = returnBook;
        this.checkout = checkOut;
    }

    public void start() {
        do {
            outputHandler.display(MENU_OPTIONS);
            choice = inputHandler.readInteger();
                if (choice == 1) {
                PromptForBookName();
                if (checkout.isInterestedToCheckOut())
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
