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
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    // TODO: Add toString() method for displaying book info
}
