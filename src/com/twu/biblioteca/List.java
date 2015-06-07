package com.twu.biblioteca;

import java.util.ArrayList;

public class List {
   public static ArrayList<Book> listOfBooks = new ArrayList <Book>();
    public static Book oneBook = new Book("C Balagurusamy","Balagurusamy",1990);
    public static Book twoBook = new Book("C++","Balagurusamy",1995);
    public static Book threeBook = new Book("Java","O'Reilly",2012);

    public static ArrayList<Book> getListOfBooks(){
        listOfBooks.add(oneBook);
        listOfBooks.add(twoBook);
        listOfBooks.add(threeBook);
        return listOfBooks;
    }

}
