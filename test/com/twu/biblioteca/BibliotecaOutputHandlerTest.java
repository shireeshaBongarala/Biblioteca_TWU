package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BibliotecaOutputHandlerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testToCheckIfCorrectWelcomeMessageIsPrintedOnConsole() {
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.display(Messages.WELCOME_MESSAGE);

        String actualMessage = Messages.WELCOME_MESSAGE;

        assertThat(actualMessage, is(outContent.toString()));
    }
    @Test
    public void testToCheckIfListOfBooksAreDisplayedOnConsole() {
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.display(new Books(BibliotecaApp.getListOfBooks()));

        String actualListOfBooks = "C Balagurusamy    Balagurusamy    1990\n" +
                "C++    Balagurusamy    1995\n" +
                "Java    O'Reilly    2012\n";

        assertThat(actualListOfBooks.toString(), is(outContent.toString()));
    }

    @Test
    public void testToCheckIfMainMenuOptionsAreDisplayedOnScreen(){
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.display(Messages.MENU_OPTIONS);

        String actualMainMenuOptions = Messages.MENU_OPTIONS;

        assertThat(actualMainMenuOptions.toString(),is(outContent.toString()));

    }

    @Test
    public void testToCheckIfCorrectInvalidChoiceMessageIsDisplayedOnScreen(){
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.display(Messages.ERROR_MESSAGE);

        String actualErrorMessage = Messages.ERROR_MESSAGE;

        assertThat(actualErrorMessage,is(outContent.toString()));
    }
    @Test
    public void testToCheckIfQuitMessageIsDisplayedOnScreen(){
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.displayQuitMessage();

        String actualErrorMessage = "Thank you\n";

        assertThat(actualErrorMessage,is(outContent.toString()));
    }


    @After
    public void tearDown() {
        System.setOut(new PrintStream(outContent));
    }

}
