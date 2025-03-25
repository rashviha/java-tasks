import java.util.Scanner;

class charposition {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 
        System.out.print("Enter a character to find its position: ");
        char charToFind = scanner.next().charAt(0); 
        int position = inputString.indexOf(charToFind);
        if (position != -1) {
            System.out.println("The character '" + charToFind + "' is found at index: " + position);
        } else {
            System.out.println("The character '" + charToFind + "' is not found in the string.");
        }
    }
}
