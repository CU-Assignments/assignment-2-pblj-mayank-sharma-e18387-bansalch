import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        Product[] products = new Product[n]; // Array of Product objects

        // Taking input for each product
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(id, name, price); // Creating and storing product
        }

        // Displaying all products
        System.out.println("\nDisplaying All Products:");
        for (Product product : products) {
            product.displayDetails();
        }

        scanner.close();
    }
}
