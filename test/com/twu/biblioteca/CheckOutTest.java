package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;

import static com.twu.biblioteca.Messages.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
    private Books books;

//
//    @Test
//    public void shouldReadTheBookNameWhenUserIsInterestedToCheckOutABook() {
//        CheckOut checkOut = new CheckOut(outputHandlerMock, checkOutMenuMock,mainMenuViewMock);
//        checkOut.ReadBookName();
//
//        when(checkOut.isInterestedToCheckOut())
//                .thenReturn(true);
//        when(checkOut.getBookName(outputHandlerMock))
//                .thenReturn("C Balagurusamy");
//        when(checkOutMenuMock.getChoice())
//                .thenReturn("y");
//
//       verify(checkOutMenuMock,atLeast(1)).getBookName(outputHandlerMock);
//
//    }
    @Test
    public void shouldDisplayUnSuccessfulCheckOutMessageWhenBookIsNotFound() {
        CheckOut checkOut = new CheckOut(outputHandlerMock,mainMenuViewMock);
        checkOut.ReadBookName();
//
//        when(checkOut.getBookName(outputHandlerMock))
//                .thenReturn("C++");

        when(mainMenuViewMock.readLine())
                .thenReturn("C++");

        verify(outputHandlerMock).display(UNSUCCESSFUL_CHECKOUT_MESSAGE);
    }

    @Test
    public void testToCheckIfCorrectBookNameIsReturned() {
        MainMenuView mainMenuView = new MainMenuView(new ByteArrayInputStream("\ny".getBytes()));
        CheckOut checkOut = new CheckOut(outputHandlerMock,mainMenuView);

        boolean actualResult = checkOut.isInterestedToCheckOut();

        assertThat(actualResult,is(true));
    }
}
