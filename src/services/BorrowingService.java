package services;

import models.User;
import models.Book;
import models.BorrowRecord;

import java.util.ArrayList;

public class BorrowingService {
    private ArrayList<BorrowRecord> borrowRecords;

    public BorrowingService() {
        this.borrowRecords = new ArrayList<>();
    }

    // TODO (Kimhor): Implement these methods

    public boolean borrowBook(User user, Book book) {
        // TODO: Create new borrow record
        // TODO: Decrease book's copiesAvailable
        // TODO: Set due date to 14 days from now
        return false;
    }

    public boolean returnBook(User user, Book book) {
        // TODO: Find the borrow record
        // TODO: Set return date to today
        // TODO: Increase book's copiesAvailable
        return false;
    }

    public ArrayList<BorrowRecord> getActiveBorrows() {
        // TODO: Return all records where returnDate is null
        return null;
    }

    public ArrayList<BorrowRecord> getUserBorrows(User user) {
        // TODO: Return all active borrows for specific user
        return null;
    }
}
