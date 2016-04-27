package com.thoughtworks.tw101.biblioteca;

/**
 * Created by andreang on 4/26/16.
 */
public class Book {
    private final String title;
    private final int publishDate;
    private final String author;

    public Book(String title, int publishDate, String author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }
}
