package services;

import models.Book;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    // TODO (Morngdyza): Implement these methods

    public void addBook(String title, String author, String genre, String ISBN, int copies) {
        // TODO: Create new book and add to list
    }

    public ArrayList<Book> viewAllBooks() {
        return books;
    }

    public void updateBook(String ISBN, String newTitle, String newAuthor, String newGenre) {
        // TODO: Find book and update details
    }

    public void removeBook(String ISBN) {
        // TODO: Find and remove book from list
    }

    // Search methods
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
