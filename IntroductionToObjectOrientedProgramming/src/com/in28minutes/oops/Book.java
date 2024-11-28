package com.in28minutes.oops;

public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void read() {
        System.out.printf("Reading book %s\n", title);
    }
}
