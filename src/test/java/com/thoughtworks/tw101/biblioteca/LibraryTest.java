package com.thoughtworks.tw101.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {

    @Test
    public void shouldListAllBooksWhenBookListRequested() {
        List<Book> bookList = new ArrayList<Book>();
        Book book1 = mock(Book.class);
        when(book1.details()).thenReturn("Details 1");
        bookList.add(book1);
        Book book2 = mock(Book.class);
        when(book2.details()).thenReturn("Details 2");
        bookList.add(book2);


        Library library = new Library(bookList);

        String listOfLibraryBooks = library.bookDetails();

        String value = "Details 1\nDetails 2\n";
        assertThat(listOfLibraryBooks, is(value));

    }
}
