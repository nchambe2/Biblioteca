package com.thoughtworks.tw101.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by andreang on 4/26/16.
 */
public class ApplicationTest {
    @Test
    public void shouldWelcomeWhenStarting(){

        PrintStream printStream = mock(PrintStream.class);
        Application application = new Application(printStream);

        application.start();

        verify(printStream).println(contains("Welcome"));
    }

}