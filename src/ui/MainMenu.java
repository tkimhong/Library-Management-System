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

    public void start() {
        // 1. User Management
        // 2. Book Management
        // 3. Borrowing System
        // 4. View Overdue Books
        // 5. Exit

        boolean running = true;

        while (running) {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. User Management");
            System.out.println("2. Book Management");
            System.out.println("3. Borrowing System");
            System.out.println("4. View Overdue Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // to have an empty space

            switch (choice) {
                case 1:
                    userManagementMenu();
                    break;
                case 2:
                    bookManagementMenu();
                    break;
                case 3:
                    borrowingMenu();
                    break;
                case 4:
                    viewOverdueBooks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }

    private void userManagementMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n=== USER MANAGEMENT ===");
            System.out.println("0. Add New User");
            System.out.println("1. View User Details");
            System.out.println("2. Edit User");
            System.out.println("3. Deactivate User");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    addNewUser();
                    break;
                case 1:
                    viewUserDetails();
                    break;
                case 2:
                    editUserInfo();
                    break;
                case 3:
                    deactivateUserAccount();
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
