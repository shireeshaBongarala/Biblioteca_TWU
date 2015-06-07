package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListTest {
    @Test
    public void testToCheckIfCorrectListIsReturned(){
        ArrayList<Book> list;
        list = List.getListOfBooks();

        ArrayList<Book> actualList = new ArrayList<Book>();

        actualList.add(List.oneBook);
        actualList.add(List.twoBook);
        actualList.add(List.threeBook);
        Assert.assertTrue(list.equals( actualList));
    }

}
