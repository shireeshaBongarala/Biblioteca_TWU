package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ListTest {

    @Test
    public void testToCheckIfContainsReturnsTrueWhenABookIsAdded(){
        ListOfBooks listOfBooks = new ListOfBooks();

        Book book = new Book("C Balagurusamy", "Balagurusamy", 1990);

        assertTrue(listOfBooks.contains(book));
    }
    
}
