import ui.MainMenu;
import services.BookService;
import services.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Library Book Borrowing System");
        System.out.println("=============================");

        // Initialize services
        BookService bookService = new BookService();
        UserService userService = new UserService();

        // Ask user if they want sample data
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLoad sample data for testing? (y/n): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("y") || choice.equals("yes")) {
            // Add sample books for testing
            System.out.println("\nAdding sample books for testing...");
            bookService.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "978-0743273565", 3);
            bookService.addBook("1984", "George Orwell", "Dystopian", "978-0451524935", 2);
            bookService.addBook("To Kill a Mockingbird", "Harper Lee", "Fiction", "978-0061120084", 4);
            bookService.addBook("Clean Code", "Robert C. Martin", "Programming", "978-0132350884", 2);
            bookService.addBook("Introduction to Algorithms", "Thomas Cormen", "Computer Science", "978-0262033848", 1);
            System.out.println("Added 5 sample books");

            // Add sample users for testing
            System.out.println("\nAdding sample users for testing...");
            userService.addUser("Alice Johnson", "STU001", "alice@example.com");
            userService.addUser("Bob Smith", "STU002", "bob@example.com");
            userService.addUser("Charlie Brown", "STU003", "charlie@example.com");
            System.out.println("Added 3 sample users\n");
        } else {
            System.out.println("\nStarting with empty library.\n");
        }

        MainMenu menu = new MainMenu(bookService, userService);
        menu.start();
    }
}
