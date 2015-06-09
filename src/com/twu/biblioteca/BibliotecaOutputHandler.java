package com.twu.biblioteca;

public class BibliotecaOutputHandler {

    public void displayWelcomeMessage() {

        System.out.print("Welcome to Biblioteca Library Management System");
    }
    public void displayListOfBooks(Books books) {

        System.out.print(books);
    }
    public void displayErrorMessage() {

        System.out.print("Select a valid option!");
    }
    public void displayMainMenuOptions(){
        System.out.println("Select choice:");
        System.out.println("1. Book List");
    }


}
