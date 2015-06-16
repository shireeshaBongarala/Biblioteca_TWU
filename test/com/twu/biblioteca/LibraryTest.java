package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    @Test
    public void shouldBeInitializedWithStaticBookList() {
        Library library = new Library();
        ArrayList <Book> books;

        books = library.getAvailableBookList();

        assertFalse(books.isEmpty());
    }
    @Test
    public void shouldAddToBookListWhenItIsValidCheckedOutBook() {
        Library library = new Library();

        String bookName = "Let Us C";

        assertThat(library.addToAvailableBookList(bookName),is(true));
    }

}


