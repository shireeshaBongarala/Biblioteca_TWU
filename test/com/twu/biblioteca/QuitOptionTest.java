package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class QuitOptionTest {
    @Test
    public void testToCheckIfQuitMessageIsCalledInPerformAction() {

        BibliotecaOutputHandler bibliotecaOutputHandler = mock(BibliotecaOutputHandler.class);
     QuitOption quitOption = new QuitOption();

        quitOption.performAction(bibliotecaOutputHandler);

        verify(bibliotecaOutputHandler).display(Messages.QUIT_MESSAGE);
    }
}
