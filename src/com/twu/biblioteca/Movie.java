package com.twu.biblioteca;

public class Movie {
    String name;
    int year;
    String director;
    int rating;
    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {

        return name + "    " + year + "    " + director + "    " + rating;
    }
}
