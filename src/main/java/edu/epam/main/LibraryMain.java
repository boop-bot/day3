package edu.epam.main;

import edu.epam.entity.Book;
import edu.epam.entity.Library;
import edu.epam.report.LibraryReport;
import edu.epam.service.LibraryService;

import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book(100, "1984", "Orwell", "AST",
                1948, 200, 20, "Hard cover");
        Book book2 = new Book(101, "Master and Margarita", "Bulgakov", "Paris",
                1967, 300, 22, "Hard cover");
        Book book3 = new Book(102, "Harry Potter", "Rowling", "EKSMO",
                1997, 400, 15, "Hard cover");
        Book book4 = new Book(103, "Lord of the rings", "Tolkien", "ROSMEN",
                1954, 400, 20, "Hard cover");
        Book book5 = new Book(104, "Game of thrones", "Martin", "Alpha",
                1996, 550, 25, "Hard cover");
        Library library = new Library(book1, book2, book3, book4, book5);
        LibraryService libraryService = new LibraryService();
        LibraryReport libraryReport = new LibraryReport();

        String author = new String("Rowling");
        List<Book> bookListAuthor = libraryService.findBooksByAuthor(author, library);
        libraryReport.printFindAuthorReport(author, bookListAuthor);

        String publishingHouse = new String("AST");
        List<Book> bookListPublishingHouse = libraryService.findBooksByPublishingHouse(publishingHouse, library);
        libraryReport.printFindPublishingHouseReport(publishingHouse, bookListPublishingHouse);

        int year = 1995;
        List<Book> bookListYear = libraryService.findBooksAfterYear(year, library);
        libraryReport.printFindYearReport(year, bookListYear);
    }
}
