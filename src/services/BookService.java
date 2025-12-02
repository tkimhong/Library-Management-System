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
        Book book = searchByISBN(ISBN);
        if (book != null) {
            books.remove(book);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found with ISBN: " + ISBN);
        }
    }

    // Search methods
    // TODO (Morngdyza): Implement these methods
    // NOTE: searchByISBN is implemented below for CRUD ops
    // The other 3 search methods need implementation

    public ArrayList<Book> searchByTitle(String title) {
        // TODO: Search books by title
        // Hint: Loop through books then check if title contains search term (case-insensitive)
        return new ArrayList<>();
    }

    public ArrayList<Book> searchByAuthor(String author) {
        // TODO: Search books by author
        // Hint: Loop through books then check if author contains search term (case-insensitive)
        return new ArrayList<>();
    }

    public ArrayList<Book> searchByGenre(String genre) {
        // TODO: Search books by genre
        // Hint: Loop through books then check if genre matches (case-insensitive)
        return new ArrayList<>();
    }

    public Book searchByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
