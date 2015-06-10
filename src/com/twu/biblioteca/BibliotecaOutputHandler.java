package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaOutputHandler {

    PrintStream out;

    public BibliotecaOutputHandler(PrintStream out) {
        this.out = out;
    }

    public void display(Object o) {
        out.print(o);
    }
}

