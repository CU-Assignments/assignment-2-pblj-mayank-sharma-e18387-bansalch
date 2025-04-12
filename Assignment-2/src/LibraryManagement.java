import java.util.*;

class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book[] books = new Book[n]; // Array of Book objects

        // Taking input for each book
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book Type (Fiction/Non-Fiction): ");
            String type = scanner.nextLine();

            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Book Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter Book Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (type.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(title, author, price);
            } else {
                books[i] = new NonFiction(title, author, price);
            }
        }

        System.out.println("\nDisplaying All Books:");
        for (Book book : books) {
            book.displayDetails();
        }

        scanner.close();
    }
}
