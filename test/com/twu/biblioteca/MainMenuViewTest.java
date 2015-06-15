package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;

import static com.twu.biblioteca.Messages.ENTER_BOOK_NAME;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

public class MainMenuViewTest {
    @Mock
    private OutputHandler outputHandlerMock;

    @Test
    public void testToCheckIfAnOptionHasBeenPressed(){
        MainMenuView mainMenuView = new MainMenuView(new ByteArrayInputStream("1".getBytes()));

        int actualResult = mainMenuView.readInteger();

        assertThat(actualResult,is(1));
    }

    @Test
    public void testToCheckIfCheckOutHasBeenCalled() {
        MainMenuView mainMenuView = new MainMenuView(new ByteArrayInputStream(("y\nC++".getBytes())));

       String  actualResult = mainMenuView.readLine();

        assertThat(actualResult,is("y"));
    }

}
