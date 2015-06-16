package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static com.twu.biblioteca.Messages.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CheckOutTest {
    @Mock
    private OutputHandler outputHandlerMock;

    @Mock
    private InputHandler inputHandlerMock;

    @Mock
    private Library libraryMock;

    @Mock
    private Books books;

    @Test
    public void shouldDisplayUnSuccessfulCheckOutMessageWhenBookIsNotFound() {
        CheckOut checkOut = new CheckOut(outputHandlerMock, inputHandlerMock,libraryMock);
        checkOut.checkOutBook();

        when(inputHandlerMock.readLine())
                .thenReturn("C++");

        verify(outputHandlerMock).display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
    }

    @Test
    public void shouldReturnTrueIfUserIsInterestedToCheckOutABook() {
        InputHandler inputHandler = new InputHandler(new ByteArrayInputStream("\ny".getBytes()));
        CheckOut checkOut = new CheckOut(outputHandlerMock, inputHandler,libraryMock);

        boolean actualResult = checkOut.isInterestedToCheckOut();

        assertThat(actualResult,is(true));
    }

    @Test
    public void shouldReturnFalseIfUserIsNotInterestedToCheckOutABook() {
        InputHandler inputHandler = new InputHandler(new ByteArrayInputStream("\nn".getBytes()));
        CheckOut checkOut = new CheckOut(outputHandlerMock, inputHandler,libraryMock);

        boolean actualResult = checkOut.isInterestedToCheckOut();

        assertThat(actualResult,is(false));

    }
    @Test
    public void shouldDisplaySuccessfulCheckOutMessageWhenRequiredBookIsAvailable(){
        Library library = new Library();
        InputHandler inputHandler = new InputHandler(new ByteArrayInputStream("C++".getBytes()));
        CheckOut checkOut = new CheckOut(outputHandlerMock,inputHandler,library);

        checkOut.checkOutBook();

        verify(outputHandlerMock).display(SUCCESSFUL_CHECKOUT_MESSAGE);
    }
}

