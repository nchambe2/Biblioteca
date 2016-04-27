package com.thoughtworks.tw101.biblioteca;

import com.thoughtworks.tw101.biblioteca.Application;
import com.thoughtworks.tw101.biblioteca.Book;
import com.thoughtworks.tw101.biblioteca.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Harry Potter", "1998", "Hello"));
        bookList.add(new Book("The Bible", "1978", "Great Guy"));

        Library library = new Library(bookList);
        Application application = new Application(System.out, library);

        application.start();
    }
}
