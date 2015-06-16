package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class EntryPoint {
    public static void main(String args[]) {
        OutputHandler OutputHandler = new OutputHandler(new PrintStream(System.out));
        InputHandler inputHandler = new InputHandler(System.in);
        Library library = new Library();
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("IronMan",2000,"James",9));
        Movies movies = new Movies(movieList);
        new BibliotecaApp(
                new OutputHandler(new PrintStream(System.out)),
                inputHandler,
                new Books(library.getAvailableBookList()), new ReturnBook(System.in,library), new CheckOut(OutputHandler, inputHandler,library),movies).start();
    }
}
