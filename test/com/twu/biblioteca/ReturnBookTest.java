package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;

import static com.twu.biblioteca.Messages.*;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ReturnBookTest {
    @Mock
    private OutputHandler outputHandlerMock;
    @Mock
    private MainMenu mainMenuMock;
    @Mock
    private CheckOutMenu checkOutMenuMock;
    @Mock
    private Books books;

    @Test
    public void shouldPromptTheUserToEnterTheBookName() {
        ReturnBook returnBook = new ReturnBook(new ByteArrayInputStream("C Balagurusamy".getBytes()));

        returnBook.getBookDetails(outputHandlerMock);

        verify(outputHandlerMock).display(ENTER_BOOK_NAME_FOR_RETURNING);
    }
}
