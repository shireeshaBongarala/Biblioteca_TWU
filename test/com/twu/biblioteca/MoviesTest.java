package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MoviesTest {
    @Mock
    Movie movieOneMock,movieTwoMock,movieThreeMock;
    @Test
    public void shouldDisplayListOfMoviesInCorrectFormat() {
        ArrayList <Movie> movieList = new ArrayList<Movie>();
        movieOneMock = mock(Movie.class);
        movieTwoMock = mock(Movie.class);
        movieThreeMock = mock(Movie.class);

        movieList.add(movieOneMock);
        movieList.add(movieTwoMock);
        movieList.add(movieThreeMock);
        Movies movies = new Movies(movieList);

        when((movieOneMock).toString())
                .thenReturn("one");
        when((movieTwoMock).toString())
                .thenReturn("two");
        when((movieThreeMock).toString())
                .thenReturn("three");

        String actualMovieList  = movies.toString();
        assertThat(actualMovieList, is("one\ntwo\nthree\n"));
    }
}
