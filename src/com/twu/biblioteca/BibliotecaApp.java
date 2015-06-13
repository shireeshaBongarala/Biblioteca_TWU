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
        String bookName;
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
        String bookName;
        bibliotecaOutputHandler.display(books);
        bibliotecaOutputHandler.display(USER_PROMPT_FOR_CHECKOUT_BOOK);
        if (checkOutMenu.isInterestedToCheckOut()) {
            bookName = checkOutMenu.getBookName(bibliotecaOutputHandler);

            int index = -1;
            for (Book book : EntryPoint.bookList) {
                if (book.getName().equals(bookName)) {
                    index = EntryPoint.bookList.indexOf(book);
                    System.out.print("Checked out" + book);
                    break;
                }

            }
            if (index != -1) {
                EntryPoint.bookList.remove(index);
            }
        }
    }
}
