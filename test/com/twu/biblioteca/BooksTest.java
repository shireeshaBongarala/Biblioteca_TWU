package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksTest {

    @Test
    public void testIfBookDetailsArePrintedOnConsole() {
        ArrayList<Book> list = new ArrayList<Book>();
        Book oneBook = mock(Book.class);
        Book twoBook = mock(Book.class);
        Book threeBook = mock(Book.class);
        list.add(oneBook);
        list.add(twoBook);
        list.add(threeBook);
        Books books = new Books(list);
        when(oneBook.getBookDetails())
                .thenReturn("one");
        when(twoBook.getBookDetails())
                .thenReturn("two");
        when(threeBook.getBookDetails())
                .thenReturn("three");


        String actualBooks = books.toString();

        assertThat(actualBooks, is("one\ntwo\nthree\n"));
    }

}
