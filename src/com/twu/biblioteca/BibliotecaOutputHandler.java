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
    }

//   // public void displayQuitMessage() {
//        System.out.println("Thank you");
//    }
}
