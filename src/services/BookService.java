package services;

import models.Book;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, String genre, String ISBN, int copies) {
        Book newBook = new Book(title, author, genre, ISBN, copies);
        books.add(newBook);
        System.out.println("Book added successfully: " + title);
    }

    public ArrayList<Book> viewAllBooks() {
        return books;
    }

    public void updateBook(String ISBN, String newTitle, String newAuthor, String newGenre) {
        Book book = searchByISBN(ISBN);
        if (book != null) {
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            book.setGenre(newGenre);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found with ISBN: " + ISBN);
        }
    }

    public void removeBook(String ISBN) {
        // TODO: Find and remove book from list
    }

    // Search methods
    // TODO (Morngdyza): Implement these methods
    public ArrayList<Book> searchByTitle(String title) {
        // TODO: Search books by title
        return null;
    }

    public ArrayList<Book> searchByAuthor(String author) {
        // TODO: Search books by author
        return null;
    }

    public ArrayList<Book> searchByGenre(String genre) {
        // TODO: Search books by genre
        return null;
    }

    public Book searchByISBN(String ISBN) {
        // TODO: Search book by ISBN (unique)
        return null;
    }
}
