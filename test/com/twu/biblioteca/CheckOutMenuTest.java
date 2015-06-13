package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import static com.twu.biblioteca.Messages.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)

public class CheckOutMenuTest {


    @Mock
    private BibliotecaOutputHandler bibliotecaOutputHandlerMock;

    @Test
    public void testToCheckIfCheckOutHasBeenCalled() {
        CheckOutMenu checkOutMenu = new CheckOutMenu(new ByteArrayInputStream(("y\nC++".getBytes())));

        checkOutMenu.bookCheckOut(bibliotecaOutputHandlerMock);


        verify(bibliotecaOutputHandlerMock).display(ENTER_BOOK_NAME);
    }

}
