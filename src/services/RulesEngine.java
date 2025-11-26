package services;

import models.User;
import models.Book;
import models.BorrowRecord;

import java.time.LocalDate;
import java.util.ArrayList;

public class RulesEngine {
    private static final int MAX_BOOKS_PER_USER = 3;
    private static final int BORROWING_PERIOD_DAYS = 14;

    // TODO (Tiangkimhong): Implement these methods

    public boolean canUserBorrow(User user, ArrayList<BorrowRecord> userBorrows) {
        // TODO: Check if user is active
        // TODO: Check if user has less than 3 books
        return false;
    }

    public boolean isBookAvailable(Book book) {
        // TODO: Check if book has copies available
        return false;
    }

    public LocalDate calculateDueDate(LocalDate borrowDate) {
        // TODO: Add 14 days to borrow date
        return borrowDate.plusDays(BORROWING_PERIOD_DAYS);
    }

    public boolean isOverdue(BorrowRecord record) {
        // TODO: Check if current date is past due date and not returned
        return false;
    }

    public ArrayList<BorrowRecord> getOverdueRecords(ArrayList<BorrowRecord> allRecords) {
        // TODO: Filter and return only overdue records
        return null;
    }

    public void markOverdueRecords(ArrayList<BorrowRecord> records) {
        // TODO: Update isOverdue flag for overdue records
    }
}
