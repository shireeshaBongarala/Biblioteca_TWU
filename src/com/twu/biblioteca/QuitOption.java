package com.twu.biblioteca;

public class QuitOption implements MenuOption {
    @Override
    public void performAction(outputHandler outputHandler) {
        outputHandler.display(Messages.QUIT_MESSAGE);
    }
}
