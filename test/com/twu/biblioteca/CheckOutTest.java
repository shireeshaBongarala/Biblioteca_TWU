package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CheckOutTest {
    @Mock
    private outputHandler outputHandlerMock;

    @Mock
    private MainMenu mainMenuMock;
    @Mock
    private CheckOutMenu checkOutMenu;

    @Mock
    private Books books;
    @Test
    public void test() {
        CheckOut checkOut = new CheckOut(outputHandlerMock,checkOutMenu);
        checkOut.DisplayBookListAndGetNameAndCheckOutBook();

        when(checkOutMenu.isInterestedToCheckOut())
                .thenReturn(true);
        when(checkOutMenu.getBookName(outputHandlerMock))
              .thenReturn("C Balagurusamy");
        when(checkOutMenu.getChoice())
                .thenReturn("y");

        verify(checkOutMenu).getBookName(outputHandlerMock);
    }

    @Test
    public void test1() {
        CheckOut checkOut = new CheckOut(outputHandlerMock,checkOutMenu);
        checkOut.DisplayBookListAndGetNameAndCheckOutBook();

        when(checkOutMenu.isInterestedToCheckOut())
                .thenReturn(true);
        when(checkOutMenu.getBookName(outputHandlerMock))
                .thenReturn("C Balagurusamy");
        when(checkOutMenu.getChoice())
                .thenReturn("y");

       assertThat(checkOutMenu.isInterestedToCheckOut(),is(true));
       verify(checkOutMenu,atLeast(1)).getBookName(outputHandlerMock);
      //  verify(outputHandlerMock).display(SUCCESSFUL_CHECKOUT_MESSAGE);

    }
}
