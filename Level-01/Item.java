public class Item { // Class to represent an item

    String itemCode; // Variable to store the item code
    String itemName; // Variable to store the item name
    double price; // Variable to store the unit price of the item
    int quantity; // Variable to store the quantity of the item

    // Constructor to initialize the item details
    public Item(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode; // Assign the provided item code to the instance variable
        this.itemName = itemName; // Assign the provided item name to the instance variable
        this.price = price; // Assign the provided price to the instance variable
        this.quantity = quantity; // Assign the provided quantity to the instance variable
    }

    // Method to display the item details
    public void ItemDetails() {
        System.out.println("Code of the item: " + itemCode); // Display the item code
        System.out.println("Name of the item: " + itemName); // Display the item name
        System.out.println("Unit price of the item: " + price); // Display the unit price of the item
    }

    // Method to calculate and display the total cost of the items based on quantity
    public void TotalCost() {
        double cost = quantity * price; // Calculate the total cost
        System.out.println("Total price of the item according to quantity: " + cost); // Display the total cost
    }

    // Main method to run the program
    public static void main(String args[]) {
        Item item1 = new Item("123XYZ", "Book", 1000, 5); // Create an Item object with specific details
        item1.ItemDetails(); // Call the method to display item details
        item1.TotalCost(); // Call the method to display the total cost
    }
}
