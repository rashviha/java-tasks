import java.util.Scanner;

class count {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 
        // Calculate the length of string
        int length = inputString.length();
     
        System.out.println("The count of characters in the given string is: " + length);
    }
}
