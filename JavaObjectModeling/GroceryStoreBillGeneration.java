import java.util.ArrayList;
import java.util.List;

// Creating a Product class to represent individual products in the grocery store
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize the Product object with provided name, price per unit, and quantity
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getter method for the product name
    public String getName() {
        return name;
    }

    // Getter method for the product price per unit
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Getter method for the product quantity
    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for the product
    public double calculateTotalPrice() {
        return pricePerUnit * quantity;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

// Creating a Customer class to represent customers in the grocery store
class Customer {
    private String name;
    private List<Product> products;

    // Constructor to initialize the Customer object with provided name
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>(); // Initializing the ArrayList of products
    }

    // Method to add a product to the customer's list of purchased products
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter method for the customer name
    public String getName() {
        return name;
    }

    // Getter method for the products
    public List<Product> getProducts() {
        return products;
    }

    // Method to display customer details and purchased products
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Purchased Products:");
        for (Product product : products) {
            System.out.println("  - " + product);
        }
    }
}

// Creating a BillGenerator class to compute the total bill for a customer
class BillGenerator {
    // Method to calculate the total bill for a customer based on their purchased products
    public double calculateTotal(Customer customer) {
        List<Product> products = customer.getProducts();
        double total = 0;
        for (Product product : products) {
            total += product.calculateTotalPrice();
        }
        return total;
    }
}

// Main class to demonstrate the functionality of the grocery store bill generation application
public class GroceryStoreBillGeneration {
    public static void main(String[] args) {
        // Creating Product objects
        Product apples = new Product("Apples", 3.0, 2.0); // 2 kg at $3 per kg
        Product milk = new Product("Milk", 2.0, 1.0); // 1 liter at $2 per liter

        // Creating a Customer object
        Customer customer = new Customer("Alice");

        // Adding products to the customer's list of purchased products
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Displaying customer details and purchased products
        customer.displayCustomerDetails();

        // Creating a BillGenerator object
        BillGenerator billGenerator = new BillGenerator();

        // Calculating and displaying the total bill for the customer
        double totalBill = billGenerator.calculateTotal(customer);
        System.out.println("Total Bill: $" + totalBill);
    }
}