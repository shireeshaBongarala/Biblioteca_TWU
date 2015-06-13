package com.twu.biblioteca;

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
        do {
            bibliotecaOutputHandler.display(MENU_OPTIONS);
            choice = mainMenu.getChoice(bibliotecaOutputHandler);
            if(choice == 1) {
                DisplayBookListAndGetNameAndCheckOutBook();
            }
            else if(choice == 2)
                bibliotecaOutputHandler.display(QUIT_MESSAGE);
            else
                bibliotecaOutputHandler.display(ERROR_MESSAGE);

        }while(choice != 2);
    }

    private void DisplayBookListAndGetNameAndCheckOutBook() {
        PromptForBookName();
        if (checkOutMenu.isInterestedToCheckOut()) {
            CheckOutBook(getBookName());
        }
    }

    private void PromptForBookName() {
        bibliotecaOutputHandler.display(books);
        bibliotecaOutputHandler.display(USER_PROMPT_FOR_CHECKOUT_BOOK);
    }

    private String getBookName() {
        String bookName;
        bookName = checkOutMenu.getBookName(bibliotecaOutputHandler);
        return bookName;
    }

    private void CheckOutBook(String bookName) {
        int index = -1;
        for (Book book : EntryPoint.bookList) {
            if (book.getName().equals(bookName)) {
                index = EntryPoint.bookList.indexOf(book);
                bibliotecaOutputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
                break;
            }
        }
        if (index != -1) {
            EntryPoint.bookList.remove(index);
        }
        else{
           bibliotecaOutputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
        }
    }
}
