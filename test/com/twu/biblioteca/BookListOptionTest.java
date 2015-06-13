package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

public class BookListOptionTest {
    @Mock
    private BibliotecaOutputHandler bibliotecaOutputHandlerMock;
    @Test
    public void testToCheckIfDisplayIsCalledInPerformAction() {
        Books books = mock(Books.class);
        BookListOption bookListOption = new BookListOption(books);

        bookListOption.performAction(bibliotecaOutputHandlerMock);

        verify(bibliotecaOutputHandlerMock).display(books);
    }

    @Test
    public void testToCheckIfUserIsPromptedOfCheckingOutABook() {
        Books books = mock(Books.class);
        BookListOption bookListOption = new BookListOption(books);

        bookListOption.performAction(bibliotecaOutputHandlerMock);

        verify(bibliotecaOutputHandlerMock,atLeast(1)).display(Messages.USER_PROMPT_FOR_CHECKOUT_BOOK);
    }
}
