package edu.epam.entity;

import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(Book ... books) {
        this.books = Arrays.asList(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book getBook(int i) {
        return books.get(i);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int size() {
        return books.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library");
        sb.append("books=").append(books.toString()).append('}');
        return sb.toString();
    }
}
