package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//
@RunWith(MockitoJUnitRunner.class)
public class BibliotecaAppTest {
    @Mock
    private OutputHandler outputHandlerMock;
    @Mock
    private InputHandler inputHandlerMock;
    @Mock
    private ReturnBook returnBookMock;
    @Mock
    private CheckOut checkOutMock;
    @Mock
    private Books booksMock;
    @Mock
    private Movies moviesMock;

    @Test
    public void shouldDisplayListOfBooksWhenChoiceIsOne(){
        Library library = new Library();
        Books expectedBooks = new Books(library.getAvailableBookList());
        when(inputHandlerMock.readInteger()).thenReturn(1,1,1, 4);

        BibliotecaApp bibliotecaApp =
                new BibliotecaApp(outputHandlerMock, inputHandlerMock, expectedBooks, returnBookMock, checkOutMock, moviesMock);

        bibliotecaApp.start();

        verify(outputHandlerMock, atLeast(1)).display(expectedBooks);
    }

    @Test
    public void shouldDisplayQuitMessageWhenChoiceIsTwo(){
        Library library = new Library();
        Books expectedBooks = new Books(library.getAvailableBookList());

        when(inputHandlerMock.readInteger())
                .thenReturn(4);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, inputHandlerMock, expectedBooks , returnBookMock, checkOutMock,moviesMock);
        bibliotecaApp.start();

        verify(outputHandlerMock, atLeast(1)).display(Messages.QUIT_MESSAGE);
    }

    @Test
    public void shouldDisplayErrorMessageWhenChoiceIsNeitherOneOrTwo(){
        Library library = new Library();
        Books expectedBooks = new Books(library.getAvailableBookList());
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, inputHandlerMock, expectedBooks, returnBookMock, checkOutMock,moviesMock);
        when(inputHandlerMock.readInteger())
                .thenReturn(8,4);
        bibliotecaApp.start();

        verify(outputHandlerMock, atLeast(1)).display(Messages.ERROR_MESSAGE);
    }

    @Test
    public void shouldGetBookDetailsIfUserWantsToReturnABook() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, inputHandlerMock, booksMock, returnBookMock, checkOutMock,moviesMock);

        when(inputHandlerMock.readInteger())
                .thenReturn(2,4);
               bibliotecaApp.start();

        verify(returnBookMock).getBookDetails(outputHandlerMock);
    }

    @Test
    public void shouldCallCheckoutBookIfUserIsInterestedToCheckOutABook() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, inputHandlerMock, booksMock, returnBookMock, checkOutMock,moviesMock);

        when(inputHandlerMock.readInteger())
                .thenReturn(1,4);
        when(checkOutMock.isInterestedToCheckOut())
                .thenReturn(true);
        bibliotecaApp.start();

        verify(checkOutMock).checkOutBook();
    }
    @Test
    public void shouldDisplayListOfMoviesWhenUserSelectsChoiceThree(){
       Movie movie = new Movie("C",1990,"Balagurusamy",10);
        ArrayList <Movie> movieList = new ArrayList<Movie>();
        movieList.add(movie);
        Movies movies = new Movies(movieList);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(
                outputHandlerMock, inputHandlerMock, booksMock, returnBookMock, checkOutMock,movies);

        when(inputHandlerMock.readInteger())
                .thenReturn(3,4);
        bibliotecaApp.start();

        verify(outputHandlerMock).display(movies);
    }
}
