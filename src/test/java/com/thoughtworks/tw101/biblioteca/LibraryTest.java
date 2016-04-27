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
    public void shouldListAllBooksWhenBookListRequested() {
        List<String> bookList = new ArrayList<String>();
        bookList.add("The Hobbit");
        bookList.add("Harry Potter and the Sorcerer's Stone");

        Library library = new Library(bookList);

        String listOfLibraryBooks = library.returnBookList();

        assertTrue(listOfLibraryBooks.contains("The Hobbit"));
        assertTrue(listOfLibraryBooks.contains("Harry Potter and the Sorcerer's Stone"));

    }

    @Test
    public void shouldListAuthorAndPublishDateWhenBookListRequested(){
        List<Book> bookList = new ArrayList<Book>();
        Book harryPotterBook = new Book("Harry Potter", 1998, "JK Rowling");
        bookList.add(harryPotterBook);

        Library library = new Library(bookList);


    }
}
