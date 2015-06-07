package com.twu.biblioteca;

public class BibliotecaOutputHandler {

    public void displayWelcomeMessage() {

        System.out.print("Welcome to Biblioteca Library Management System");
    }
    public void displayListOfBooks() {

        System.out.print(new Books(List.getListOfBooks()));
    }


}
