package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    CheckOutMenu checkOutMenu;
    outputHandler outputHandler;
    CheckOut(outputHandler outputHandler,CheckOutMenu checkOutMenu){

        this.checkOutMenu = checkOutMenu;
        this.outputHandler = outputHandler;
    }
    public void DisplayBookListAndGetNameAndCheckOutBook() {
       String bookName = checkOutMenu.getBookName(outputHandler);
            CheckOutBook(bookName);
    }

    public void CheckOutBook(String bookName) {
        int index = -1;
        for (Book book : EntryPoint.bookList) {
            if (book.getName().equals(bookName)) {
                index = EntryPoint.bookList.indexOf(book);
                outputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
                break;
            }
        }
        if (index != -1) {
            EntryPoint.bookList.remove(index);
        }
        else{
            outputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
        }
    }
}
