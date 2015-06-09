package com.twu.biblioteca;

public class BibliotecaApp {
    public int choice;

    public BibliotecaApp(BibliotecaOutputHandler bibliotecaOutputHandler){

        MainMenu mainMenu = new MainMenu(System.in);
        choice = mainMenu.getChoice(bibliotecaOutputHandler);

        if(choice == 1)
            bibliotecaOutputHandler.displayListOfBooks(new Books(List.getListOfBooks()));
        else
            bibliotecaOutputHandler.displayErrorMessage();

    }

    public void start()
    {

    }
}
