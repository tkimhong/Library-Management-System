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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public boolean isAvailable() {
        return copiesAvailable > 0;
    }

    public void borrowCopy() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        }
    }

    public void returnCopy() {
        if (copiesAvailable < totalCopies) {
            copiesAvailable++;
        }
    }

    @Override
    public String toString() {
        return "Book{" + "title'" + title + '\'' + ", author='" + author + '\'' + ", genre='" + genre + '\'' + ", ISBN='" + ISBN + '\'' + ", copiesAvailable=" + copiesAvailable + ", totalCopies=" + totalCopies +
                +'}';
    }
}
