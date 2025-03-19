import java.util.Scanner;

class count {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Read the entire line
        // Calculate the length of the string
        int length = inputString.length();
        // Output the result
        System.out.println("The count of characters in the given string is: " + length);
    }
}
