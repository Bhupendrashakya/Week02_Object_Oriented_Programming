public class MobilePhone { // Class to represent a mobile phone

    String brand; // Variable to store the brand of the mobile phone
    String model; // Variable to store the model of the mobile phone
    double price; // Variable to store the price of the mobile phone

    // Constructor to initialize the mobile phone details
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand; // Assign the provided brand to the instance variable
        this.model = model; // Assign the provided model to the instance variable
        this.price = price; // Assign the provided price to the instance variable
    }

    // Method to display the mobile phone details
    public void MobileDetails() {
        System.out.println("Brand of mobile phone: " + brand); // Display the brand of the mobile phone
        System.out.println("Model of mobile phone: " + model); // Display the model of the mobile phone
        System.out.println("Price of mobile phone: " + price); // Display the price of the mobile phone
    }

    // Main method to run the program
    public static void main(String args[]) {
        MobilePhone mobilePhone1 = new MobilePhone("Vivo", "T1 5G", 20000); // Create a MobilePhone object with specific details
        mobilePhone1.MobileDetails(); // Call the method to display the mobile phone details
    }
}
