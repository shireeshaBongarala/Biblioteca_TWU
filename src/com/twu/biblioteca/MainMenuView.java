package com.twu.biblioteca;

import java.io.InputStream;

import java.util.Scanner;

public class MainMenuView {

    private final Scanner scanner;

    public MainMenuView(InputStream in) {
        scanner = new Scanner(in);
    }

    public int readInteger() {
        return scanner.nextInt();
    }
    public String readLine() {
        return scanner.nextLine();
    }
}
