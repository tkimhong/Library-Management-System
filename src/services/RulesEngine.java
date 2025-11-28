package services;

import models.User;
import models.Book;
import models.BorrowRecord;

import java.time.LocalDate;
import java.util.ArrayList;

public class RulesEngine {
    private static final int MAX_BOOKS_PER_USER = 3;
    private static final int BORROWING_PERIOD_DAYS = 14;

    public boolean canUserBorrow(User user, ArrayList<BorrowRecord> userBorrows) {
        if (!user.isActive()){
            return false;
        }

        if (userBorrows.size() >= MAX_BOOKS_PER_USER){
            return false;
        }

        return true;
    }

    public boolean isBookAvailable(Book book) {
        return book.getCopiesAvailable() > 0;
    }

    public LocalDate calculateDueDate(LocalDate borrowDate) {
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
