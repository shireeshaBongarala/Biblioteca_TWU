package com.twu.biblioteca;

import java.io.PrintStream;

public class outputHandler {

    PrintStream out;

    public outputHandler(PrintStream out) {
        this.out = out;
    }

    public void display(Object o) {
        out.print(o);
    }
}

