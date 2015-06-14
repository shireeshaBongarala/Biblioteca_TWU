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
    private outputHandler outputHandlerMock;
    @Test
    public void testToCheckIfDisplayIsCalledInPerformAction() {
        Books books = mock(Books.class);
        BookListOption bookListOption = new BookListOption(books);

        bookListOption.performAction(outputHandlerMock);

        verify(outputHandlerMock).display(books);
    }

    @Test
    public void testToCheckIfUserIsPromptedOfCheckingOutABook() {
        Books books = mock(Books.class);
        BookListOption bookListOption = new BookListOption(books);

        bookListOption.performAction(outputHandlerMock);

        verify(outputHandlerMock,atLeast(1)).display(Messages.USER_PROMPT_FOR_CHECKOUT_BOOK);
    }
}
