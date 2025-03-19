import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an Account object with initial values
        Account ac = new Account("Rashviha", 2000000000);
        
        // Print the current account holder's name and balance
        System.out.println("Account holder name: " + ac.getAccholder());
        System.out.println("Balance: " + ac.getBalance());
        
        // Update the account holder's name
        ac.setAccholder("Dhilip");
        System.out.println("Updated account holder name: " + ac.getAccholder());
        
        // Ask the user to enter the amount to credit
        System.out.print("Enter amount to credit: ");
        int creditAmount = scanner.nextInt(); 
        
        // Add the credit amount to the balance
        ac.addCredit(creditAmount);
        
        // Print the updated balance
        System.out.println("Updated balance: " + ac.getBalance());
        
        scanner.close(); // Close the scanner
    }
}

class Account {
    private String Accholder;
    private int Balance;

    // Constructor that accepts account holder name and initial balance
    Account(String Accholder, int Balance) {
        this.Accholder = Accholder;
        this.Balance = Balance;
    }

    // Getter method for account holder name
    public String getAccholder() {
        return Accholder;
    }

    // Getter method for balance
    public int getBalance() {
        return Balance;
    }

    // Setter method to update account holder name
    public void setAccholder(String Accholder) {
        this.Accholder = Accholder;
    }

    // Method to add credit to the account balance
    public void addCredit(int credit) {
        this.Balance += credit;
    }
}
