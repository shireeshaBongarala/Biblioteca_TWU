package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksTest {

    @Test
    public void testIfBookDetailsArePrintedOnConsole() {
        ArrayList <Book> list= new ArrayList<Book>();
        Book oneBook = mock(Book.class);
        Book twoBook = mock(Book.class);
        Book threeBook = mock(Book.class);
        list.add(oneBook);
        list.add(twoBook);
        list.add(threeBook);
        Books books = new Books(list);

        when(oneBook.getBookDetails())
                .thenReturn("C Balagurusamy    Balagurusamy    1990");
        when(twoBook.getBookDetails())
                .thenReturn("C++    Balagurusamy    1995");
        when(threeBook.getBookDetails())
                .thenReturn("Java    O'Reilly    2012");
        String  actualListOfBooks ="C Balagurusamy    Balagurusamy    1990\nC++    Balagurusamy    1995\nJava    O'Reilly    2012\n" ;

        assertThat(actualListOfBooks.toString(), CoreMatchers.is(books.toString()));
    }

}
