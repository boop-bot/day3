package edu.epam.service;

import edu.epam.entity.Book;
import edu.epam.entity.Library;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

public class LibraryServiceTest {
    Library library;
    LibraryService libraryService;

    @BeforeClass
    public void setUp() {
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
        library = new Library(book1, book2, book3, book4, book5);
        libraryService = new LibraryService();
    }

    @Test
    public void testFindBooksAuthor() {
        List<Book> expected = new LinkedList<Book>();
        expected.add(library.getBook(2));
        List<Book> actual = libraryService.findBooksByAuthor("Rowling", library);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindBooksPublishingHouse() {
        List<Book> expected = new LinkedList<Book>();
        expected.add(library.getBook(0));
        List<Book> actual = libraryService.findBooksByPublishingHouse("AST", library);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindBooksAfterYear() {
        List<Book> expected = new LinkedList<Book>();
        expected.add(library.getBook(2));
        expected.add(library.getBook(4));
        List<Book> actual = libraryService.findBooksAfterYear(1995, library);
        assertEquals(actual, expected);
    }

    @AfterClass
    public void clear() {
        this.library = null;
        this.libraryService = null;
    }

}