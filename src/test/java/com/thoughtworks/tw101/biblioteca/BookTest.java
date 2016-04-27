package com.thoughtworks.tw101.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void shouldReturnBookDetails(){
        Book book = new Book("Harry Potter", "1998", "Jk Rowling");

        String bookInformation = book.details();

        assertThat(bookInformation, is("Harry Potter 1998 Jk Rowling"));
    }

}

