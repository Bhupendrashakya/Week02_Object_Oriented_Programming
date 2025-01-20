import java.util.ArrayList;

public class CartItem { // Class to represent an item in the shopping cart

    String itemName; // Variable to store the item name
    double price; // Variable to store the item price
    int quantity; // Variable to store the item quantity

    // Constructor to initialize the cart item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName; // Assign the provided item name to the instance variable
        this.price = price; // Assign the provided price to the instance variable
        this.quantity = quantity; // Assign the provided quantity to the instance variable
    }
}

class ShoppingCart { // Class to manage the shopping cart

    ArrayList<CartItem> cartItems; // List to store cart items

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        cartItems = new ArrayList<>(); // Initialize the cart items list
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        cartItems.add(item); // Add the item to the cart
        System.out.println("Item added: " + item.itemName);
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); i++) {
            CartItem item = cartItems.get(i);
            if (item.itemName.equals(itemName)) {
                cartItems.remove(i); // Remove the item from the cart
                System.out.println("Item removed: " + itemName);
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }

    // Method to display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.price * item.quantity; // Calculate the total cost
        }
        System.out.println("Total cost: " + totalCost);
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        System.out.println("Items in the cart:");
        for (CartItem item : cartItems) {
            System.out.println(item.itemName + " - " + item.quantity + " @ " + item.price + " each");
        }
    }

    // Main method to run the program
    public static void main(String args[]) {
        ShoppingCart cart = new ShoppingCart(); // Create a ShoppingCart object

        CartItem item1 = new CartItem("Laptop", 1000, 1); // Create a CartItem object
        CartItem item2 = new CartItem("Headphones", 200, 2); // Create another CartItem object

        cart.addItem(item1); // Add item1 to the cart
        cart.addItem(item2); // Add item2 to the cart

        cart.displayCartItems(); // Display all items in the cart

        cart.displayTotalCost(); // Display the total cost of items in the cart

        cart.removeItem("Headphones"); // Remove item2 from the cart

        cart.displayCartItems(); // Display all items in the cart after removal
        cart.displayTotalCost(); // Display the total cost of items in the cart after removal
    }
}
