package edu.epam.entity;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book ... books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book getBook(int i) {
        return books[i];
    }

    public int size() {
        return books.length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library");
        sb.append("books=").append(Arrays.toString(books)).append('}');
        return sb.toString();
    }
}
