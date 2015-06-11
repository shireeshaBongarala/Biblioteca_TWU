package com.twu.biblioteca;

public class BookListOption implements MenuOption {
    Books books;
    public BookListOption(Books books) {
        this.books = books;
    }

    public void performAction(BibliotecaOutputHandler bibliotecaOutputHandler) {

        bibliotecaOutputHandler.display(books);

    }
}
