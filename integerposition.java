import java.util.Scanner;

class integerposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 
        System.out.print("Enter a number to find its position: ");
        String numberToFind = scanner.next(); 
        int position = inputString.indexOf(numberToFind);
        
        if (position != -1) {
            System.out.println("The number '" + numberToFind + "' is found at index: " + position);
        } else {
            System.out.println("The number '" + numberToFind + "' is not found in the string.");
        }
    }
}
