package models;

public class Book {
    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private int copiesAvailable;
    private int totalCopies;

    public Book(String title, String author, String genre, String ISBN, int totalCopies) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.totalCopies = totalCopies;
        this.copiesAvailable = totalCopies;   // Initially all copies are available
    }

    // TODO: Add getters and setters

    // TODO: Add toString() method for displaying book info
}
