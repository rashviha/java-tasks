import java.util.Scanner;

class integerposition {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Read the entire line
        
        // Ask the user to input the number to find
        System.out.print("Enter a number to find its position: ");
        String numberToFind = scanner.next(); // Read the number as a string
        
        // Find the position of the number
        int position = inputString.indexOf(numberToFind);
        
        // Check if the number is found and output the result
        if (position != -1) {
            System.out.println("The number '" + numberToFind + "' is found at index: " + position);
        } else {
            System.out.println("The number '" + numberToFind + "' is not found in the string.");
        }
    }
}
