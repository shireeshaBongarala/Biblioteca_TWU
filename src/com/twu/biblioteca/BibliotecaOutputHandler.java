package com.twu.biblioteca;

import java.io.PrintWriter;

public class BibliotecaOutputHandler {

    PrintWriter out;

    public BibliotecaOutputHandler(PrintWriter out) {
        this.out = out;
    }
    public BibliotecaOutputHandler(){
    }

    public void display(Object o) {
        System.out.print(o);
        //System.out.print("Welcome to Biblioteca Library Management System");
    }

    public void displayListOfBooks(Books books) {

        System.out.print(books);
    }

    public void displayErrorMessage() {

        System.out.print("Select a valid option!");
    }

    public void displayMainMenuOptions() {
        System.out.println("Select choice:");
        System.out.println("1. Book List");
    }


    public void displayQuitMessage() {
        System.out.println("Thank you");
    }
}
