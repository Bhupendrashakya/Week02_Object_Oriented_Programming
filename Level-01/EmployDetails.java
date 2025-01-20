public class EmployDetails { // Class definition

    String name; // Employee name
    int id; // Employee ID
    double salary; // Employee salary

    // Constructor
    public EmployDetails(String name, int id, double salary) {
        this.name = name; // Initialize name
        this.id = id; // Initialize ID
        this.salary = salary; // Initialize salary
    }

    // Method to display details
    public void DisplayDetails() {
        System.out.println("employee name : " + name); // Print name
        System.out.println("employee id : " + id); // Print ID
        System.out.println("employee salary : " + salary); // Print salary
    }

    // Main method
    public static void main(String args[]){
        EmployDetails emp1 = new EmployDetails("gourav", 100, 700000); // Create an employee object
        emp1.DisplayDetails(); // Display employee details
    }
}
