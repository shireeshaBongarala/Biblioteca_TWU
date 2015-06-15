package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESSFUL_CHECKOUT_MESSAGE;
import static com.twu.biblioteca.Messages.UNSUCCESSFUL_CHECKOUT_MESSAGE;

public class CheckOut {
    OutputHandler outputHandler;
    MainMenuView mainMenuView;

    CheckOut(OutputHandler OutputHandler,MainMenuView mainMenuView) {
        this.outputHandler = OutputHandler;
        this.mainMenuView = mainMenuView;
    }

    public boolean isInterestedToCheckOut(){
           mainMenuView.readLine();
        if(mainMenuView.readLine().equals("y")) return true;
        return false;
    }

    public void ReadBookName() {

       // String bookName = checkOutMenu.getBookName(outputHandler);
        outputHandler.display(Messages.ENTER_BOOK_NAME);
        String bookName = mainMenuView.readLine();
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
            EntryPoint.checkedOutBookList.add(EntryPoint.bookList.get(index));
            EntryPoint.bookList.remove(index);

        } else {
            outputHandler.display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
        }

    }
}
