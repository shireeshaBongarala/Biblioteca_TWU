package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    OutputHandler outputHandler;
    InputHandler inputHandler;
    Library library;

    CheckOut(OutputHandler OutputHandler, InputHandler inputHandler,Library library) {
        this.outputHandler = OutputHandler;
        this.inputHandler = inputHandler;
        this.library = library;
    }

    public boolean isInterestedToCheckOut() {
        inputHandler.readLine();
        if (inputHandler.readLine().equals("y")) return true;
        return false;
    }

    public void checkOutBook() {
        String bookName = inputHandler.readLine();
        if (library.additionToCheckedOutBookListIsSuccessful(bookName)) {
            outputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
        } else
            outputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
    }
}
