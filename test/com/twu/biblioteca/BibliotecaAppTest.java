package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BibliotecaAppTest {

    @Test
    public void shouldDisplayListOfBooksWhenChoiceIsOne(){
        Books expectedBooks = new Books(BibliotecaApp.getListOfBooks());
        MainMenu mainMenuStub = mock(MainMenu.class);
        BibliotecaOutputHandler bibliotecaOutputHandlerStub = mock(BibliotecaOutputHandler.class);
        when(mainMenuStub.getChoice(bibliotecaOutputHandlerStub))
                .thenReturn(1,2);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                bibliotecaOutputHandlerStub, mainMenuStub, expectedBooks);

        Mockito.verify(bibliotecaOutputHandlerStub,atLeast(1)).display(expectedBooks);
    }

    @Test
    public void shouldDisplayQuitMessageWhenChoiceIsTwo(){
        Books expectedBooks = new Books(BibliotecaApp.getListOfBooks());
        MainMenu mainMenuStub = mock(MainMenu.class);
        BibliotecaOutputHandler bibliotecaOutputHandlerStub = mock(BibliotecaOutputHandler.class);
        when(mainMenuStub.getChoice(bibliotecaOutputHandlerStub))
                .thenReturn(2);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                bibliotecaOutputHandlerStub, mainMenuStub, expectedBooks);

        Mockito.verify(bibliotecaOutputHandlerStub,atLeast(1)).display(Messages.QUIT_MESSAGE);
    }

    @Test
    public void shouldDisplayErrorMessageWhenChoiceIsNeitherOneOrTwo(){
        Books expectedBooks = new Books(BibliotecaApp.getListOfBooks());
        MainMenu mainMenuStub = mock(MainMenu.class);
        BibliotecaOutputHandler bibliotecaOutputHandlerStub = mock(BibliotecaOutputHandler.class);
        when(mainMenuStub.getChoice(bibliotecaOutputHandlerStub))
                .thenReturn(3,2);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                bibliotecaOutputHandlerStub, mainMenuStub, expectedBooks);

        Mockito.verify(bibliotecaOutputHandlerStub,atLeast(1)).display(Messages.ERROR_MESSAGE);
    }
}
