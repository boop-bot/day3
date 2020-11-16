package edu.epam.report;

import edu.epam.entity.Book;

import java.util.List;

public class LibraryReport {
    public void printFindAuthorReport(String author, List<Book> books) {
        System.out.println("Author ..... " + author);
        System.out.println(books.toString());
    }

    public void printFindPublishingHouseReport(String publishingHouse, List<Book> books) {
        System.out.println("Publishing house ..... " + publishingHouse);
        System.out.println(books.toString());
    }

    public void printFindYearReport(int year, List<Book> books) {
        System.out.println("year ..... " + year);
        System.out.println(books.toString());
    }
}
