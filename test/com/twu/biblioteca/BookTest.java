package com.twu.biblioteca;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    @Test
    public void testToCheckIfBookDetailsAreReturnedInRequiredFormat(){
        Book book = new Book("C Balagurusamy","Balagurusamy",1990);
        String actualBookDetails = "C Balagurusamy"+ "    "+"Balagurusamy"+"    "+1990;

        assertThat(actualBookDetails,is(book.getBookDetails()));

    }
}
