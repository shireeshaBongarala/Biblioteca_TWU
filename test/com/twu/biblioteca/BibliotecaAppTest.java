package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BibliotecaAppTest {

    @Before
    public void setUp() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
    }

    @Test
    public void shouldDisplayListOfBooksWhenChoiceIsOne(){
        MainMenu mainMenuStub = mock(MainMenu.class);

        BibliotecaOutputHandler bibliotecaOutputHandlerStub = mock(BibliotecaOutputHandler.class);
        when(mainMenuStub.getChoice(bibliotecaOutputHandlerStub))
                .thenReturn(1);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaOutputHandlerStub);
        Mockito.verify(bibliotecaOutputHandlerStub).displayListOfBooks((Books) any());
    }

    @After
    public void tearDown() {
     System.setIn(System.in);
    }


}
