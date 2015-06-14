package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    CheckOutMenu checkOutMenu;
    BibliotecaOutputHandler bibliotecaOutputHandler;
    CheckOut(BibliotecaOutputHandler bibliotecaOutputHandler,CheckOutMenu checkOutMenu){

        this.checkOutMenu = checkOutMenu;
        this.bibliotecaOutputHandler = bibliotecaOutputHandler;
    }
    public void DisplayBookListAndGetNameAndCheckOutBook() {
       String bookName = checkOutMenu.getBookName(bibliotecaOutputHandler);
            CheckOutBook(bookName);
    }


   public String getBookName() {
        String bookName;
        bookName = checkOutMenu.getBookName(bibliotecaOutputHandler);
        return bookName;
    }

    public void CheckOutBook(String bookName) {
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
