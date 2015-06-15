package com.twu.biblioteca;

public class BookListOption implements MenuOption {
    Books books;
    public BookListOption(Books books) {
        this.books = books;
    }

    public void performAction(OutputHandler outputHandler) {

        outputHandler.display(books);
        outputHandler.display(Messages.USER_PROMPT_FOR_CHECKOUT_BOOK);
           // new CheckOutMenu(System.in).getBookName(outputHandler);

    }

}
