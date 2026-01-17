package controller;
import java.util.Scanner;
import model.Book;
import service.LibraryService;
public class LibraryController {
    private final LibraryService service = new LibraryService();
    private final Scanner sc = new Scanner(System.in);
    public void start() {
        try {
            while (true) {
                System.out.println("\n================================");
                System.out.println("     DIGITAL LIBRARY SYSTEM");
                System.out.println("================================");
                System.out.println("1. Admin Panel");
                System.out.println("2. User Panel");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = getValidInput();
                switch (choice) {
                    case 1 -> adminMenu();
                    case 2 -> userMenu();
                    case 3 -> {
                        System.out.println("Thank you for using Digital Library!");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
    private void adminMenu() {
        System.out.println("\n--- ADMIN PANEL ---");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter choice: ");
        int ch = getValidInput();
        switch (ch) {
            case 1 -> addBook();
            case 2 -> viewBooks();
            case 3 -> { }
            default -> System.out.println("Invalid option!");
        }
    }
    private void userMenu() {
        System.out.println("\n--- USER PANEL ---");
        System.out.println("1. View Books");
        System.out.println("2. Issue Book");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter choice: ");
        int ch = getValidInput();
        switch (ch) {
            case 1 -> viewBooks();
            case 2 -> issueBook();
            case 3 -> { }
            default -> System.out.println("Invalid option!");
        }
    }
    private void addBook() {
        try {
            System.out.print("Enter Book ID: ");
            int id = getValidInput();
            sc.nextLine();
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine().trim();
            System.out.print("Enter Author Name: ");
            String author = sc.nextLine().trim();
            Book book = new Book(id, title, author, false);
            service.addBook(book);
            System.out.println("Book added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while adding the book.");
            sc.nextLine();
        }
    }
    private void viewBooks() {
        System.out.println("\n--- Available Books ---");
        if (service.getAllBooks().isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("ID | Title | Author | Status");
        System.out.println("-----------------------------------");
        for (Book b : service.getAllBooks()) {
            System.out.println(
                    b.getId() + " | " + b.getTitle() + " | " + b.getAuthor() +
                    " | " + (b.isIssued() ? "Issued" : "Available")
            );
        }
    }
    private void issueBook() {
        try {
            System.out.print("Enter Book ID to Issue: ");
            int id = getValidInput();
            Book book = service.searchBookById(id);
            if (book != null && !book.isIssued()) {
                book.setIssued(true);
                service.saveChanges();
                System.out.println("Book issued successfully!");
            } else if (book != null && book.isIssued()) {
                System.out.println("Book is already issued.");
            } else {
                System.out.println("Book not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while issuing the book.");
            sc.nextLine();
        }
    }
    private int getValidInput() {
        try {
            return sc.nextInt();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Invalid input! Please enter a number.");
            return -1;
        }
    }
}