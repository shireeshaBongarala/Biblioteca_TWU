package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

public class InputHandlerTest {
    @Mock
    private OutputHandler outputHandlerMock;

    @Test
    public void testToCheckIfAnOptionHasBeenPressed(){
        InputHandler inputHandler = new InputHandler(new ByteArrayInputStream("1".getBytes()));

        int actualResult = inputHandler.readInteger();

        assertThat(actualResult,is(1));
    }

    @Test
    public void testToCheckIfCheckOutHasBeenCalled() {
        InputHandler inputHandler = new InputHandler(new ByteArrayInputStream(("y\nC++".getBytes())));

       String  actualResult = inputHandler.readLine();

        assertThat(actualResult,is("y"));
    }

}
