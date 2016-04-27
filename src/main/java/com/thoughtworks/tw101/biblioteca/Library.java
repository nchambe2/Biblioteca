package com.thoughtworks.tw101.biblioteca;

import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library(List<Book> bookList){

        this.bookList = bookList;
    }

    public String bookDetails() {
        String bookListString = "";
        for(Book book : bookList) {
            bookListString += book.details() + "\n";
        }
        return bookListString;
    }

}
