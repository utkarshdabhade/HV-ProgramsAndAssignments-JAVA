import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private String specification;
    private double cost;
    private int count;

    public Product(int id, String name, String specification, double cost, int count) {
        this.id = id;
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.count = count;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class InventoryManagementSystem {
    private List<Product> products;
    private int nextId;

    public InventoryManagementSystem() {
        this.products = new ArrayList<>();
        this.nextId = 1;
    }

    public void addProduct(Product product) {
        products.add(product);
        appendDataToCSV(product);
    }

    private void appendDataToCSV(Product product) {
        try (FileWriter writer = new FileWriter("inventory.csv", true)) {
            writer.append(String.valueOf(product.getId())).append(",");
            writer.append(product.getName()).append(",");
            writer.append(product.getSpecification()).append(",");
            writer.append(String.valueOf(product.getCost())).append(",");
            writer.append(String.valueOf(product.getCount())).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        nextId++;
    }

    // Other methods for inventory management...

    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Inventory Management System Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product specification: ");
                    String specification = scanner.next();
                    System.out.print("Enter product cost: ");
                    double cost = scanner.nextDouble();
                    System.out.print("Enter product count: ");
                    int count = scanner.nextInt();

                    Product product = new Product(inventory.nextId, name, specification, cost, count);
                    inventory.addProduct(product);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }
}
