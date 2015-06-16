package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    @Test
    public void testToCheckIfMovieIsDisplayedInCorrectFormat() {
        Movie movie = new Movie("C",1998,"Balagurusamy",10);

        String expectedMovieDetails = "C" + "    " +"1998"+"    "+ "Balagurusamy" + "    " + "10";

        assertThat(expectedMovieDetails, is(movie.toString()));
    }
}
