package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static com.twu.biblioteca.Messages.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CheckOutTest {
    @Mock
    private OutputHandler outputHandlerMock;

    @Mock
    private MainMenuView mainMenuViewMock;
    @Mock
    private CheckOutMenu checkOutMenuMock;

    @Mock
    private Books books;


    @Test
    public void shouldReadTheBookNameWhenUserIsInterestedToCheckOutABook() {
        CheckOut checkOut = new CheckOut(outputHandlerMock, checkOutMenuMock);
        checkOut.ReadBookName();

        when(checkOutMenuMock.isInterestedToCheckOut())
                .thenReturn(true);
        when(checkOutMenuMock.getBookName(outputHandlerMock))
                .thenReturn("C Balagurusamy");
        when(checkOutMenuMock.getChoice())
                .thenReturn("y");

       verify(checkOutMenuMock,atLeast(1)).getBookName(outputHandlerMock);

    }
    @Test
    public void shouldDisplayUnSuccessfulCheckOutMessageWhenBookIsNotFound() {
        CheckOut checkOut = new CheckOut(outputHandlerMock, checkOutMenuMock);
        checkOut.ReadBookName();

        when(checkOutMenuMock.getBookName(outputHandlerMock))
                .thenReturn("C++");

        verify(outputHandlerMock).display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
    }
}
