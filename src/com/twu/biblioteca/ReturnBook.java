package com.twu.biblioteca;

import java.io.InputStream;
import java.util.Scanner;

import static com.twu.biblioteca.Messages.*;


public class ReturnBook {
    private final Scanner scanner;

    public ReturnBook(InputStream in) {
        scanner = new Scanner(in);
    }

    public void getBookDetails(OutputHandler outputHandler) {

        outputHandler.display(ENTER_BOOK_NAME_FOR_RETURNING);
        String bookName = scanner.nextLine();

        int found = 0;
        if(EntryPoint.checkedOutBookList != null) {
            for (Book book : EntryPoint.checkedOutBookList) {
                if (book.getName().equals(bookName)) {
                    found = 1;
                    EntryPoint.bookList.add(book);
                    outputHandler.display(SUCCESSFUL_BOOK_RETURN);
                    break;
                }
            }
        }
        if(found == 0){
            outputHandler.display(UNSUCCESSFUL_BOOK_RETURN);
        }
    }
}
