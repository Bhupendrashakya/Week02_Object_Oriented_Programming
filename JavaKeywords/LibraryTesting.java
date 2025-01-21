/*
Library Book System: Create a Book class with attributes title, 
author, price, and availability. Implement a method to borrow a book.
*/
// Creating a Class Book to store book details and manage borrowing
class Book 
{

    private static String libraryName = "Galaxy Library";

    // Declaring private attributes for the Book class
    private String title;
    private String author;
    private final String isbn;

    public static void displayLibraryName(){
        System.out.println("Library name : "+libraryName);
    }

   

    // Parameterized constructor to initialize attributes with provided values
    public Book(String title, String author,String isbn) {
        // Initializing title, author, price, and availability with specified values
        this.title = title;
        this.author = author;
        this.isbn=isbn;
    }

    // Getter method for the title attribute
    public String getTitle() {
        return title;
    }

    // Setter method for the title attribute
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for the author attribute
    public String getAuthor() {
        return author;
    }

   
    // Getter method for the price attribute
    public String getIsbn() {
        return isbn;
    }

   


    // Method to display book details in a readable format
    public void displayBookDetails() {
        // Printing the book details
       

    // Method to borrow a book

        // Checking if the book is available
        if(this instanceof Book){
            System.out.printf("title: %s, Author: %s, ISBN: %s%n",this.title,this.author,this.isbn);
        }
        else{
            System.out.println("Invalid book object");
        }
    }
}

// Creating a class LibraryTesting to demonstrate the functionalities of the Book class
public class LibraryTesting 
{
    public static void main(String[] args) 
	{
        // Creating a Book object using the parameterized constructor
        Book book1 = new Book("One piece", "Eiichiro oda", "1234567890");
        Book book2 = new Book("Solo Levelling", "Chugong","09876654321");
       
        Book.displayLibraryName();

        // Borrowing the book
        
        // Checking the book availability after borrowing
        book1.displayBookDetails();

        // Trying to borrow the book again to see the availability check
        book2.displayBookDetails();
    }
}