package com.twu.biblioteca;

import java.io.InputStream;
import java.util.Scanner;

import static com.twu.biblioteca.Messages.*;


public class ReturnBook {
    private final Scanner scanner;

    public ReturnBook(InputStream in) {
        scanner = new Scanner(in);
    }

    public void getBookDetails(OutputHandler OutputHandler) {
        OutputHandler.display(ENTER_BOOK_NAME_FOR_RETURNING);
        String bookName = scanner.nextLine();

        int found = 0;
        for (Book book : EntryPoint.referenceBookList) {
            if (book.getName().equals(bookName)) {
                found = 1;
                EntryPoint.bookList.add(book);
                OutputHandler.display(SUCCESSFUL_BOOK_RETURN);
                break;
            }
        }
        if(found == 0){
            OutputHandler.display(UNSUCCESSFUL_BOOK_RETURN);
        }
    }
}
