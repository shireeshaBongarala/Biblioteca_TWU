package com.twu.biblioteca;

import java.io.InputStream;
import java.util.Scanner;

public class CheckOutMenu {

    private Scanner scanner;

    public CheckOutMenu(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public String getChoice() {
        return scanner.nextLine();
    }

    public boolean isInterestedToCheckOut(){

        if(getChoice().equals("y")) return true;
        return false;
    }

    public String getBookName(BibliotecaOutputHandler bibliotecaOutputHandler){

          bibliotecaOutputHandler.display(Messages.ENTER_BOOK_NAME);
           return scanner.nextLine();
    }


}
