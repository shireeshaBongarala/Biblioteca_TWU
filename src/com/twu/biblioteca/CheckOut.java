package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    CheckOutMenu checkOutMenu;
    OutputHandler OutputHandler;

    CheckOut(OutputHandler OutputHandler, CheckOutMenu checkOutMenu) {

        this.checkOutMenu = checkOutMenu;
        this.OutputHandler = OutputHandler;
    }

    public void ReadBookName() {

        String bookName = checkOutMenu.getBookName(OutputHandler);
        int index = -1;

        if (EntryPoint.bookList != null) {
            for (int i = 0; i < EntryPoint.getBookListSize(); i++) {
                Book book = EntryPoint.getBookList().get(i);

                if (book.getName().equals(bookName)) {
                    index = EntryPoint.bookList.indexOf(book);
                    OutputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
                    break;
                }
            }
        }
        if (index != -1) {
            EntryPoint.checkedOutBookList.add(EntryPoint.bookList.get(index));
            EntryPoint.bookList.remove(index);

        } else {
            OutputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
        }

    }
}
