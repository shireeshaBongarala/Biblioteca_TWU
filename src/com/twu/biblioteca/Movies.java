package com.twu.biblioteca;

import java.util.ArrayList;

public class Movies {
    private ArrayList <Movie> movieList;
    Movies(ArrayList<Movie> movieList){
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        String list ="";
        for(Movie movie: movieList){
            list = list + movie.toString() + "\n";
        }
        return list;
    }
}
