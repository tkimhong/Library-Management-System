package services;

import models.User;
import models.Book;
import models.BorrowRecord;
import java.time.LocalDate;
import java.util.ArrayList;

public class BorrowingService {
    private ArrayList<BorrowRecord> borrowRecords;

    public BorrowingService() {
        this.borrowRecords = new ArrayList<>();
    }

    public boolean borrowBook(User user, Book book) {
        // Validation: Check if book is available
        if (book.getCopiesAvailable() <= 0) {
            return false;
        }

        // Create new borrow record and set due date to 14 days from now
        LocalDate today = LocalDate.now();
        LocalDate due = today.plusDays(14);
        BorrowRecord newRecord = new BorrowRecord(user, book, today, due);

        // Decrease book's copiesAvailable
        book.setCopiesAvailable(book.getCopiesAvailable() - 1);

        borrowRecords.add(newRecord);
        return true;
    }

    public boolean returnBook(User user, Book book) {
        for (BorrowRecord record : borrowRecords) {
            // Find the active record (matching user and book, not yet returned)
            if (record.getUser().equals(user) &&
                    record.getBook().equals(book) &&
                    record.getReturnDate() == null) {

                // Set return date to today
                record.setReturnDate(LocalDate.now());

                // Increase book's copiesAvailable
                book.setCopiesAvailable(book.getCopiesAvailable() + 1);

                return true;
            }
        }
        return false;
    }

    public ArrayList<BorrowRecord> getActiveBorrows() {
        ArrayList<BorrowRecord> active = new ArrayList<>();
        for (BorrowRecord record : borrowRecords) {
            // Active means returnDate is null
            if (record.getReturnDate() == null) {
                active.add(record);
            }
        }
        return active;
    }

    public ArrayList<BorrowRecord> getUserBorrows(User user) {
        ArrayList<BorrowRecord> userActive = new ArrayList<>();
        for (BorrowRecord record : borrowRecords) {
            // Return all active borrows for a specific user
            if (record.getUser().equals(user) && record.getReturnDate() == null) {
                userActive.add(record);
            }
        }
        return userActive;
    }
}