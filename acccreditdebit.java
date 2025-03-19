//acc credit and debit
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an Account object with account holder name
        Account ac = new Account("Rashviha", 0);  // Setting an initial balance of 0 temporarily

        // Display the account holder name first
        System.out.println("Account holder name: " + ac.getAccholder());

        // Prompt user for initial balance
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        // Update the account with the user's initial balance
        ac.setBalance(initialBalance);

        // Display the initial balance
        System.out.println("Initial balance: " + ac.getBalance());

        // Update the account holder name
        ac.setAccholder("Dhilip");
        System.out.println("Updated account holder name: " + ac.getAccholder());

        // Credit the account
        System.out.print("Enter amount to credit: ");
        int creditAmount = scanner.nextInt();
        ac.addCredit(creditAmount); // Add credit to the balance
        System.out.println("Updated balance after credit: " + ac.getBalance());

        // Debit the account
        System.out.print("Enter amount to debit: ");
        int debitAmount = scanner.nextInt();
        ac.adddebit(debitAmount); // Subtract debit from the balance
        System.out.println("Updated balance after debit: " + ac.getBalance());
    }
}

class Account {
    private String Accholder;
    private int Balance;

    // Constructor to initialize account holder name (with balance set to 0 initially)
    Account(String Accholder, int Balance) {
        this.Accholder = Accholder;
        this.Balance = Balance;
    }

    // Getter for account holder name
    public String getAccholder() {
        return Accholder;
    }

    // Getter for balance
    public int getBalance() {
        return Balance;
    }

    // Setter for account holder name
    public void setAccholder(String Accholder) {
        this.Accholder = Accholder;
    }

    // Setter for balance (useful for updating balance after user input)
    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    // Method to add credit to balance
    public void addCredit(int credit) {
        Balance += credit;
    }

    // Method to subtract debit from balance
    public void adddebit(int debit) {
        Balance -= debit;
    }
}

