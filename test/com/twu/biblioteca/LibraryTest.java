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
    public void shouldAddToAvialableBookListWhenItIsValidCheckedOutBook() {
        Library library = new Library();

        String bookName = "Let Us C";

        assertThat(library.additionToAvailableBookListIsSuccessful(bookName),is(true));
    }

    @Test
    public void shouldCheckOutBookFromAvailableBookListWhenBookIsValidAvaialbleBook() {
        Library library = new Library();

        String bookName = "C++";

        assertThat(library.additionToCheckedOutBookListIsSuccessful(bookName),is(true));
    }
}


