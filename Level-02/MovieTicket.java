
public class MovieTicket { // Class to represent a movie ticket

    String movieName; // Variable to store the name of the movie
    String seatNumber; // Variable to store the seat number
    double price; // Variable to store the price of the ticket

    // Constructor to initialize the movie ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName; // Assign the provided movie name to the instance variable
        this.seatNumber = seatNumber; // Assign the provided seat number to the instance variable
        this.price = price; // Assign the provided price to the instance variable
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName; // Update the movie name
        this.seatNumber = seatNumber; // Update the seat number
        this.price = price; // Update the price
        System.out.println("Ticket booked successfully!"); // Confirm booking
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName); // Display the movie name
        System.out.println("Seat Number: " + seatNumber); // Display the seat number
        System.out.println("Ticket Price: " + price); // Display the ticket price
    }

    // Main method to run the program
    public static void main(String args[]) {
        // Create a MovieTicket object with initial details
        MovieTicket ticket1 = new MovieTicket("Avengers Infinity War", "C11", 350);

        // Display the initial ticket details
        ticket1.displayTicketDetails();

        // Book a new ticket with updated details
        ticket1.bookTicket("Avenger End Game", "B15", 350);

        // Display the updated ticket details
        ticket1.displayTicketDetails();
    }
}
