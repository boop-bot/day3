package edu.epam.service;

import edu.epam.entity.Book;
import edu.epam.entity.Library;

import java.util.LinkedList;
import java.util.List;

public class LibraryService {
    public List<Book> findBooksByAuthor(String author, Library library) {
        List<Book> bookList = new LinkedList<Book>();
        for (Book book : library.getBooks()) {
            if (book.getAuthor().equals(author)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<Book> findBooksByPublishingHouse(String publishingHouse, Library library) {
        List<Book> bookList = new LinkedList<Book>();
        for (Book book : library.getBooks()) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<Book> findBooksAfterYear(int publishingYear, Library library) {
        List<Book> bookList = new LinkedList<Book>();
        for (Book book : library.getBooks()) {
            if (book.getPublishYear() >= publishingYear) {
                bookList.add(book);
            }
        }
        return bookList;
    }
}
