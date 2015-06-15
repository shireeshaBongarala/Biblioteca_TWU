package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    CheckOutMenu checkOutMenu;
    outputHandler outputHandler;

    CheckOut(outputHandler outputHandler, CheckOutMenu checkOutMenu) {

        this.checkOutMenu = checkOutMenu;
        this.outputHandler = outputHandler;
    }

    public void ReadBookName() {

        String bookName = checkOutMenu.getBookName(outputHandler);
        int index = -1;

        if (EntryPoint.bookList != null) {
            for (int i = 0; i < EntryPoint.getBookListSize(); i++) {
                Book book = EntryPoint.getBookList().get(i);

                if (book.getName().equals(bookName)) {
                    index = EntryPoint.bookList.indexOf(book);
                    outputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
                    break;
                }
            }
        }
        if (index != -1) {
            EntryPoint.bookList.remove(index);
        } else {
            outputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
        }

    }
}
