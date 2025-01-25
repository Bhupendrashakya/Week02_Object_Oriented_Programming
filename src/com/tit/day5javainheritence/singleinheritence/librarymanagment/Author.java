package com.tit.day5javainheritence.singleinheritence.librarymanagment;

class Author extends Book {
    // Unique attributes for Author
    private String name;
    private String bio;

    // Constructor to initialize Author objects with provided values
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Calling the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo() method to include author information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.printf("Author Name: %s, Bio: %s\n", name, bio);
    }
}

