package com.thoughtworks.tw101.biblioteca;

public class Book {
    private final String title;
    private final String publishDate;
    private final String author;

    public Book(String title, String publishDate, String author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public String details(){
        return title + " " + publishDate + " " + author;
    }
}

