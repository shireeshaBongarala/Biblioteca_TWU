package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class QuitOptionTest {
    @Test
    public void testToCheckIfQuitMessageIsCalledInPerformAction() {

        outputHandler outputHandler = mock(outputHandler.class);
     QuitOption quitOption = new QuitOption();

        quitOption.performAction(outputHandler);

        verify(outputHandler).display(Messages.QUIT_MESSAGE);
    }
}
