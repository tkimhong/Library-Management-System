package ui;

import services.*;
import models.Book;

import java.util.ArrayList;
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
            System.out.println("1. Add New User");
            System.out.println("2. View User Details");
            System.out.println("3. Edit User");
            System.out.println("4. Deactivate User");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewUser();
                    break;
                case 2:
                    viewUserDetails();
                    break;
                case 3:
                    editUserInfo();
                    break;
                case 4:
                    deactivateUserAccount();
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void addNewUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        userService.addUser(name, studentID, email);
    }

    private void viewUserDetails() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        userService.viewUser(studentID);
    }

    private void editUserInfo() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter new name (leave blank to skip): ");
        String newName = scanner.nextLine();

        System.out.print("Enter new email (leave blank to skip): ");
        String newEmail = scanner.nextLine();

        userService.editUser(studentID, newName, newEmail);
    }

    private void deactivateUserAccount() {
        System.out.print("Enter student ID to deactivate: ");
        String studentID = scanner.nextLine();

        userService.deactivateUser(studentID);
    }

    private void bookManagementMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n=== BOOK MANAGEMENT ===");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Search Books");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    updateBookInfo();
                    break;
                case 4:
                    removeBookEntry();
                    break;
                case 5:
                    searchBooksMenu();
                    break;
                case 6:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void addNewBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();

        System.out.print("Enter number of copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine(); // consume new line after that int

        bookService.addBook(title, author, genre, ISBN, copies);
    }
}
