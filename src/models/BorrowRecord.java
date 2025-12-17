package models;

import java.time.LocalDate;

public class BorrowRecord {
    private User user;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private boolean isOverdue;

    // Constructor
    public BorrowRecord(User user, Book book, LocalDate borrowDate, LocalDate dueDate) {
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.isOverdue = false;
    }

    // Method to check and update overdue status
    public boolean checkIsOverdue() {
        LocalDate dateToCompare = (returnDate != null) ? returnDate : LocalDate.now();
        this.isOverdue = dateToCompare.isAfter(this.dueDate);
        return this.isOverdue;
    }

    // --- Getters ---
    public User getUser() { return user; }
    public Book getBook() { return book; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public LocalDate getDueDate() { return dueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public boolean isOverdue() {
        checkIsOverdue();
        return isOverdue;
    }

    // --- Setters ---
    public void setUser(User user) { this.user = user; }
    public void setBook(Book book) { this.book = book; }
    public void setBorrowDate(LocalDate borrowDate) { this.borrowDate = borrowDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        checkIsOverdue();
    }

    // Added this specifically to fix your "cannot find symbol" error
    public void setOverdue(boolean overdue) {
        this.isOverdue = overdue;
    }

    @Override
    public String toString() {
        String status = (returnDate != null) ? "Returned on " + returnDate :
                "Active";
        String overdueStatus = isOverdue() ? " [OVERDUE]" : "";

        return "BorrowRecord{" +
                "user=" + user.getName() + " (" + user.getStudentID() + ")" +
                ", book=" + book.getTitle() + " by " + book.getAuthor() +
                ", borrowDate=" + borrowDate +
                ", dueDate=" + dueDate +
                ", status=" + status + overdueStatus +
                '}';
    }
}