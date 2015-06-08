package com.twu.biblioteca;

public class BibliotecaOutputHandler {

    public void displayWelcomeMessage() {

        System.out.print("Welcome to Biblioteca Library Management System");
    }
    public void displayListOfBooks() {

        System.out.print(new Books(List.getListOfBooks()));
    }
    public void displayErrorMessage() {
        System.out.print("Invalid Choice");
    }
    public void displayMainMenuOptions(){
        System.out.println("Select choice:");
        System.out.println("1. Book List");
    }


}
