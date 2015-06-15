package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)

public class MainMenuViewTest {
    @Mock
    private OutputHandler outputHandlerMock;

    @Test
    public void testToCheckIfAnOptionHasBeenPressed(){
        MainMenuView mainMenuView = new MainMenuView(new ByteArrayInputStream("1".getBytes()));

        int actualResult = mainMenuView.getChoice();

        assertThat(actualResult,is(1));
    }
}
