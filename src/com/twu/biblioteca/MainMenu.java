package com.twu.biblioteca;

import java.io.InputStream;

import java.util.Scanner;

public class MainMenu {

    private final Scanner scanner;

    public MainMenu(InputStream in) {
        scanner = new Scanner(in);
    }


    public int getChoice(BibliotecaOutputHandler bibliotecaOutputHandler) {

        bibliotecaOutputHandler.displayMainMenuOptions();

        return scanner.nextInt();
    }


}