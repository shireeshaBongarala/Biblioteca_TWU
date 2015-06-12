package com.twu.biblioteca;

import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

public class CheckOutMenuTest {
    @Test
    public void testToCheckIfCheckOutHasBeenCalled() {
        CheckOutMenu checkOutMenu = new CheckOutMenu(new ByteArrayInputStream(("y".getBytes())));
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler(new PrintStream(System.out));

        checkOutMenu.bookCheckOut(bibliotecaOutputHandler);


        verify(bibliotecaOutputHandler).display(Messages.ENTER_BOOK_NAME);
    }

}
