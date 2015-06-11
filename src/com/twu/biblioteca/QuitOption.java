package com.twu.biblioteca;

public class QuitOption implements MenuOption {
    @Override
    public void performAction(BibliotecaOutputHandler bibliotecaOutputHandler) {
        bibliotecaOutputHandler.display(Messages.QUIT_MESSAGE);
    }
}
