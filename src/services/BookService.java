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
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public ArrayList<Book> searchByGenre(String genre) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                results.add(book);
            }
        }
        return results;
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
