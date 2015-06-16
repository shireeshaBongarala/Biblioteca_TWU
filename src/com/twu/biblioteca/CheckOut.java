package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    OutputHandler outputHandler;
    InputHandler inputHandler;

    CheckOut(OutputHandler OutputHandler, InputHandler inputHandler) {
        this.outputHandler = OutputHandler;
        this.inputHandler = inputHandler;
    }

    public boolean isInterestedToCheckOut() {
        inputHandler.readLine();
        if (inputHandler.readLine().equals("y")) return true;
        return false;
    }

    public void checkOutBook() {
        Library library = new Library();
        outputHandler.display(Messages.ENTER_BOOK_NAME);
        String bookName = inputHandler.readLine();
//        int index = -1;
//
//        if (EntryPoint.bookList != null) {
//            for (int i = 0; i < EntryPoint.getBookListSize(); i++) {
//                Book book = EntryPoint.getBookList().get(i);
//
//                if (book.getName().equals(bookName)) {
//                    index = EntryPoint.bookList.indexOf(book);
//                    outputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
//                    break;
//                }
//            }
//        }
//        if (index != -1) {
//            EntryPoint.checkedOutBookList.add(EntryPoint.bookList.get(index));
//            EntryPoint.bookList.remove(index);
//
//        } else {
//            outputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
//        }

        if (library.additionToCheckedOutBookListIsSuccessful(bookName)) {
            outputHandler.display(SUCCESSFUL_CHECKOUT_MESSAGE);
        } else
            outputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
    }
}
