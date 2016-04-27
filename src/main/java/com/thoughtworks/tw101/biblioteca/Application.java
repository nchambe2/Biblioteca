package com.thoughtworks.tw101.biblioteca;

import java.io.PrintStream;

/**
 * Created by andreang on 4/26/16.
 */
public class Application {
    private Library library;
    private PrintStream printStream;

    public Application(PrintStream printStream, Library library) {
        this.printStream = printStream;
        this.library = library;
    }

    public void start() {
        printStream.println("Welcome to Biblioteca!");
        printStream.println(library.bookDetails());
    }
}
