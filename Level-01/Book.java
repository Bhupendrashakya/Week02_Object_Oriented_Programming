public class Book { // Class to represent a book

    String title; // Variable to store the title of the book
    String author; // Variable to store the author of the book
    double price; // Variable to store the price of the book

    // Constructor to initialize the book details
    public Book(String title, String author, double price) {
        this.title = title; // Assign the provided title to the instance variable
        this.author = author; // Assign the provided author to the instance variable
        this.price = price; // Assign the provided price to the instance variable
    }

    // Method to display the book details
    public void BookDetails() {
        System.out.println("Title of the book: " + title); // Display the title of the book
        System.out.println("Author of the book: " + author); // Display the author of the book
        System.out.println("Price of the book: " + price); // Display the price of the book
    }

    // Main method to run the program
    public static void main(String args[]) {
        Book book1 = new Book("One Piece", "Eiichiro Oda", 999); // Create a Book object with specific details
        book1.BookDetails(); // Call the method to display the book details
    }
}
