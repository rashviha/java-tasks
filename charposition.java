import java.util.Scanner;

class charposition {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Read the entire line
        
        // Ask the user to input a character to find
        System.out.print("Enter a character to find its position: ");
        char charToFind = scanner.next().charAt(0); // Read the character
        
        // Find the position of the character
        int position = inputString.indexOf(charToFind);
        
        // Check if the character is found and output the result
        if (position != -1) {
            System.out.println("The character '" + charToFind + "' is found at index: " + position);
        } else {
            System.out.println("The character '" + charToFind + "' is not found in the string.");
        }
    }
}
