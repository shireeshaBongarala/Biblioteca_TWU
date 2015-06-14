package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import java.io.ByteArrayInputStream;

import static com.twu.biblioteca.Messages.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)

public class CheckOutMenuTest {


    @Mock
    private outputHandler outputHandlerMock;

    @Test
    public void testToCheckIfCheckOutHasBeenCalled() {
        CheckOutMenu checkOutMenu = new CheckOutMenu(new ByteArrayInputStream(("y\nC++".getBytes())));

        checkOutMenu.getBookName(outputHandlerMock);

        verify(outputHandlerMock).display(ENTER_BOOK_NAME);
    }

    @Test
    public void testToCheckIfCorrectBookNameIsReturned() {
        CheckOutMenu checkOutMenu = new CheckOutMenu(new ByteArrayInputStream(("C++".getBytes())));

        String actualBookName = checkOutMenu.getBookName(outputHandlerMock);

        assertThat(actualBookName,is("C++"));
    }
}
