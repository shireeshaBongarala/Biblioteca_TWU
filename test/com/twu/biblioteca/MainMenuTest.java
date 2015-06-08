package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    @Test
    public void testToCheckIfAnOptionHasBeenPressed(){
        MainMenu mainMenu = mock(MainMenu.class);
        when(mainMenu.getChoice())
                .thenReturn(1);

        int actualOption = 1;

        assertThat(actualOption,is(mainMenu.getChoice()));
    }

}
