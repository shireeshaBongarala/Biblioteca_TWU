package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

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
        bibliotecaOutputHandler.displayWelcomeMessage();

        String actualMessage = "Welcome to Biblioteca Library Management System";

        assertThat(actualMessage, is(outContent.toString()));
    }


    @Test
    public void testToCheckIfListOfBooksAreDisplayedOnConsole() {
        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.displayListOfBooks();

        ArrayList <String> actualListOfBooks = new ArrayList<String>(Arrays.asList("C Balagurusamy","C++","Java"));


        assertThat(actualListOfBooks.toString(), is(outContent.toString()));

    }

    @After
    public void tearDown() {
        System.setOut(new PrintStream(outContent));
    }

}
