public class Circle { // Class to represent a circle

    double radius; // Variable to store the radius of the circle

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius; // Assign the provided radius to the instance variable
    }

    // Method to calculate the area of the circle
    public Double AreaOfCircle(double radius) {
        double pi = 22/7.0; // Approximate value of pi
        return pi * radius * radius; // Calculate and return area
    }

    // Method to calculate the circumference of the circle
    public double Circumference(double radius) {
        double pi = 22/7.0; // Approximate value of pi
        return 2 * pi * radius; // Calculate and return circumference
    }

    // Method to display the area and circumference of the circle
    public void AreaCircumference() {
        System.out.println("Area of circle: " + AreaOfCircle(radius)); // Display area
        System.out.println("Circumference of circle: " + Circumference(radius)); // Display circumference
    }

    // Main method to run the program
    public static void main(String args[]) {
        Circle circle1 = new Circle(5); // Create a Circle object with radius 5
        circle1.AreaCircumference(); // Call method to display area and circumference
    }
}
