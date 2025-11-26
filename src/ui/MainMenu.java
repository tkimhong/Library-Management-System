package ui;

import services.*;

import java.util.Scanner;

public class MainMenu {
    private UserService userService;
    private BookService bookService;
    private BorrowingService borrowingService;
    private RulesEngine rulesEngine;
    private Scanner scanner;

    public MainMenu() {
        this.userService = new UserService();
        this.bookService = new BookService();
        this.borrowingService = new BorrowingService();
        this.rulesEngine = new RulesEngine();
        this.scanner = new Scanner(System.in);
    }

    // TODO (Tiangkimhong): Implement menu system

    public void start() {
        // TODO: Display main menu and handle user choices
        // 1. User Management
        // 2. Book Management
        // 3. Borrowing System
        // 4. View Overdue Books
        // 5. Exit
    }
}
