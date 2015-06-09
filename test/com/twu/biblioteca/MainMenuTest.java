package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    @Test
    public void testToCheckIfAnOptionHasBeenPressed(){

        MainMenu mainMenu = new MainMenu(new ByteArrayInputStream("1".getBytes()));
        BibliotecaOutputHandler bibliotecaOutputHandlerStub = mock(BibliotecaOutputHandler.class);

        mainMenu.getChoice(bibliotecaOutputHandlerStub);

        Mockito.verify(bibliotecaOutputHandlerStub).displayMainMenuOptions();

    }


}
