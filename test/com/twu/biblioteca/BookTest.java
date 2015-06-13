package com.twu.biblioteca;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    @Test
    public void testToCheckIfBookDetailsAreReturnedInRequiredFormat(){
        Book book = new Book("C Balagurusamy","Balagurusamy",1990);

        String expectedBookDetails = "C Balagurusamy"+ "    "+"Balagurusamy"+"    "+1990;

        assertThat((book.toString()),is(expectedBookDetails));
    }

    @Test
    public void testToCheckIfBookNameReturnedIsCorrect() {
        Book book = new Book("C Balagurusamy","Balagurusamy",1990);

        String actualBookName = book.getName();

        assertThat(actualBookName,is("C Balagurusamy"));
    }
}
