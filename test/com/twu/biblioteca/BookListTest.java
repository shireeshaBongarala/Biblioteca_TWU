package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BookListTest {
    @Test
    public void testToCheckIfCorrectListIsReturned(){
        ArrayList<Book> list;
        list = BookList.getListOfBooks();

        ArrayList<Book> actualList = new ArrayList<Book>();

        actualList.add(BookList.oneBook);
        actualList.add(BookList.twoBook);
        actualList.add(BookList.threeBook);
        Assert.assertTrue(list.equals( actualList));
    }

}
