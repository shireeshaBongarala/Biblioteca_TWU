package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static com.twu.biblioteca.Messages.*;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ReturnBookTest {
    @Mock
    private OutputHandler outputHandlerMock;


    @Test
    public void shouldPromptTheUserToEnterTheBookName() {
        ReturnBook returnBook = new ReturnBook(new ByteArrayInputStream("C Balagurusamy".getBytes()));

        returnBook.getBookDetails(outputHandlerMock);

        verify(outputHandlerMock).display(ENTER_BOOK_NAME_FOR_RETURNING);
    }

    @Test
    public void shouldAddABookIfItIsValidBookToBeReturned() {
        EntryPoint.checkedOutBookList = new ArrayList<Book>();
        EntryPoint.bookList = new ArrayList<Book>();
        EntryPoint.checkedOutBookList.add(new Book("C++","Balagurusamy",1997));
        ReturnBook returnBook = new ReturnBook(new ByteArrayInputStream("C++".getBytes()));

        returnBook.getBookDetails(outputHandlerMock);

        verify(outputHandlerMock).display(SUCCESSFUL_BOOK_RETURN);
    }
}
