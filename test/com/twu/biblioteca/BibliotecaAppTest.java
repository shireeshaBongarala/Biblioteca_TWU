package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//
@RunWith(MockitoJUnitRunner.class)
public class BibliotecaAppTest {
    @Mock
    private OutputHandler outputHandlerMock;

    @Mock
    private MainMenuView mainMenuViewMock;
    @Mock
    private CheckOutMenu checkOutMenu;

    @Mock
    private ReturnBook returnBook;
    @Mock
    private CheckOut checkOut;
    @Test
    public void shouldDisplayListOfBooksWhenChoiceIsOne(){
        Books expectedBooks = new Books(EntryPoint.initializeListOfBooks());
        when(mainMenuViewMock.getChoice()).thenReturn(1,1,1, 3);

        BibliotecaApp bibliotecaApp =
                new BibliotecaApp(outputHandlerMock, mainMenuViewMock, expectedBooks, checkOutMenu,returnBook,checkOut);

        bibliotecaApp.start();

        verify(outputHandlerMock, atLeast(1)).display(expectedBooks);
    }

    @Test
    public void shouldDisplayQuitMessageWhenChoiceIsTwo(){
        Books expectedBooks = new Books(EntryPoint.initializeListOfBooks());

        when(mainMenuViewMock.getChoice())
                .thenReturn(3);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, mainMenuViewMock, expectedBooks,checkOutMenu ,returnBook,checkOut);
        bibliotecaApp.start();

        verify(outputHandlerMock, atLeast(1)).display(Messages.QUIT_MESSAGE);
    }

    @Test
    public void shouldDisplayErrorMessageWhenChoiceIsNeitherOneOrTwo(){
        Books expectedBooks = new Books(EntryPoint.initializeListOfBooks());
        when(mainMenuViewMock.getChoice())
                .thenReturn(8,3);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, mainMenuViewMock, expectedBooks,checkOutMenu ,returnBook,checkOut);
        bibliotecaApp.start();

        verify(outputHandlerMock, atLeast(1)).display(Messages.ERROR_MESSAGE);
    }

}
