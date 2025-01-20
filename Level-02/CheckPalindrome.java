public class CheckPalindrome { // Class to represent a palindrome checker

    String text; // Variable to store the text to be checked

    // Constructor to initialize the text
    public CheckPalindrome(String text) {
        this.text = text; // Assign the provided text to the instance variable
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0; // Start from the leftmost character
        int right = text.length() - 1; // Start from the rightmost character

        while (left < right) {
            // Compare characters from both ends
            if (text.charAt(left) != text.charAt(right)) {
                return false; // If characters do not match, return false
            }
            left++; // Move towards the center from the left
            right--; // Move towards the center from the right
        }

        return true; // If all characters match, return true
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome."); // Display if the text is a palindrome
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome."); // Display if the text is not a palindrome
        }
    }

    // Main method to run the program
    public static void main(String args[]) {
        CheckPalindrome check1 = new CheckPalindrome("madam"); // Create a PalindromeChecker object with specific text
        check1.displayResult(); // Call the method to display the result

        CheckPalindrome check2 = new CheckPalindrome("hello"); // Create another PalindromeChecker object with different text
        check2.displayResult(); // Call the method to display the result
    }
}
