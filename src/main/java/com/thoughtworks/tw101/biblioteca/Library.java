package com.thoughtworks.tw101.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreang on 4/26/16.
 */
public class Library {
    private List<String> bookList;

    public Library(List<String> bookList){
            this.bookList = bookList;
    }

    public String returnBookList() {
        String bookListString = "";
        for(String bookTitle : bookList) {
            bookListString += bookTitle + "\n";
        }
        return bookListString;
    }

}
