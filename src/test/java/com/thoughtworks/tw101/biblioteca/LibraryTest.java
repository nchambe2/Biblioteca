package com.thoughtworks.tw101.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by andreang on 4/26/16.
 */
public class LibraryTest {

    @Test
    public void shouldListAllBooksAfterWelcomeMessage() {
        List<String> bookList = new ArrayList<String>();
        bookList.add("The Hobbit");
        bookList.add("Harry Potter and the Sorcerer's Stone");

        Library library = new Library(bookList);

        String listOfLibraryBooks = library.returnBookList();
        
        assertTrue(listOfLibraryBooks.contains("The Hobbit"));
        assertTrue(listOfLibraryBooks.contains("Harry Potter and the Sorcerer's Stone"));

    }
}
