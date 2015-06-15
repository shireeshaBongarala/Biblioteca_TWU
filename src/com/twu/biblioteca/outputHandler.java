package com.twu.biblioteca;

import java.io.PrintStream;

public class OutputHandler {

    PrintStream out;

    public OutputHandler(PrintStream out) {
        this.out = out;
    }

    public void display(Object o) {
        out.print(o);
    }
}

