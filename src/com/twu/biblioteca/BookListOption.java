package com.twu.biblioteca;

import java.util.Scanner;

public class BookListOption implements MenuOption {
    Books books;
    public BookListOption(Books books) {
        this.books = books;
    }

    public void performAction(BibliotecaOutputHandler bibliotecaOutputHandler) {

        bibliotecaOutputHandler.display(books);
        bibliotecaOutputHandler.display(Messages.USER_PROMPT_FOR_CHECKOUT_BOOK);
           // new CheckOutMenu(System.in).bookCheckOut(bibliotecaOutputHandler);

    }
}
