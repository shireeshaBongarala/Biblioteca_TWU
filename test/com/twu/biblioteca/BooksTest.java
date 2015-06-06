package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertThat;

public class BooksTest {

    @Test
    public void testIfBookDetailsArePrintedOnConsole() {
        Books books = new Books();

    String  actualListOfBooks ="C Balagurusamy    Balagurusamy    1990\nC++    Balagurusamy    1995\nJava    O'Reilly    2012\n" ;

        assertThat(actualListOfBooks.toString(), CoreMatchers.is(books.toString()));
    }

}
