package com.twu.biblioteca;

public class BookListOption implements MenuOption {
    Books books;
    public BookListOption(Books books) {
        this.books = books;
    }

    public void performAction(OutputHandler OutputHandler) {

        OutputHandler.display(books);
        OutputHandler.display(Messages.USER_PROMPT_FOR_CHECKOUT_BOOK);
           // new CheckOutMenu(System.in).getBookName(OutputHandler);

    }

}
