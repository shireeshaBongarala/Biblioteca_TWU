package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookListOptionTest {
    @Test
    public void testToCheckIfDisplayIsCalledInPerformAction() {
        Books books = mock(Books.class);
        BibliotecaOutputHandler bibliotecaOutputHandler = mock(BibliotecaOutputHandler.class);
        BookListOption bookListOption = new BookListOption(books);

        bookListOption.performAction(bibliotecaOutputHandler);

        verify(bibliotecaOutputHandler).display(books);
    }
}
