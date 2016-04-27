package com.thoughtworks.tw101.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {
    @Test
    public void shouldWelcomeWhenStarting(){
        Library library = new Library(new ArrayList<Book>());
        PrintStream printStream = mock(PrintStream.class);
        Application application = new Application(printStream, library);

        application.start();

        verify(printStream).println(contains("Welcome"));
    }
}