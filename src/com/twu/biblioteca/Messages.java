package com.twu.biblioteca;

public interface Messages {
    public String WELCOME_MESSAGE = "Welcome to Biblioteca Library Management System\n";
    public String ERROR_MESSAGE = "Select a valid option!\n";
    public String MENU_OPTIONS = "Select Choice:\n1. Book List\n2.Return Book\n3.Quit\n";
    public String QUIT_MESSAGE = "Thank you\n";
    public String USER_PROMPT_FOR_CHECKOUT_BOOK = "Would you like to checkout a book?\n";
    public String SUCCESSFUL_CHECKOUT_MESSAGE = "Thank you! Enjoy the Book.\n";
    public String UNSUCCESSFUL_CHECKOUT_MESSAGE = "That book is not available\n";
    public String ENTER_BOOK_NAME = "Enter the Book name for Check out.:\n";
    public String ENTER_BOOK_NAME_FOR_RETURNING = "Enter Book name ";
    public String SUCCESSFUL_BOOK_RETURN = "Thank you for returning the book\n";
    public String UNSUCCESSFUL_BOOK_RETURN = "This is not a valid book to return";
}