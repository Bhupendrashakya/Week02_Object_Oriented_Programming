public class Student { // Class to represent a student

    String name; // Variable to store the student's name
    int rollNumber; // Variable to store the student's roll number
    int marks; // Variable to store the student's marks

    // Constructor to initialize the student's details
    Student(String name, int rollNumber, int marks) {
        this.name = name; // Assign the provided name to the instance variable
        this.rollNumber = rollNumber; // Assign the provided roll number to the instance variable
        this.marks = marks; // Assign the provided marks to the instance variable
    }

    // Method to calculate the grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's details and grade
    public void DisplayDetails() {
        System.out.println("Student name: " + name); // Display the student's name
        System.out.println("Student roll number: " + rollNumber); // Display the student's roll number
        System.out.println("Student marks: " + marks); // Display the student's marks
        System.out.println("Student grade: " + calculateGrade()); // Display the calculated grade
    }

    // Main method to run the program
    public static void main(String args[]) {
        Student student1 = new Student("John", 101, 85); // Create a Student object with specific details
        student1.DisplayDetails(); // Call the method to display the student's details and grade
    }
}
