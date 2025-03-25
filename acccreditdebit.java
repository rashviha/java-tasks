//acc credit and debit
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        Account ac = new Account("Rashviha", 0);  // Setting an initial balance of 0 temporarily
       
        System.out.println("Account holder name: " + ac.getAccholder());
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        
        ac.setBalance(initialBalance);
        System.out.println("Initial balance: " + ac.getBalance());

        ac.setAccholder("Dhilip");
        System.out.println("Updated account holder name: " + ac.getAccholder());

        System.out.print("Enter amount to credit: ");
        int creditAmount = scanner.nextInt();
        ac.addCredit(creditAmount); // Add credit to the balance
        System.out.println("Updated balance after credit: " + ac.getBalance());

       
        System.out.print("Enter amount to debit: ");
        int debitAmount = scanner.nextInt();
        ac.adddebit(debitAmount); // Subtract debit from the balance
        System.out.println("Updated balance after debit: " + ac.getBalance());
    }
}

class Account {
    private String Accholder;
    private int Balance;
    Account(String Accholder, int Balance) {
        this.Accholder = Accholder;
        this.Balance = Balance;
    }

    public String getAccholder() {
        return Accholder;
    }

    public int getBalance() {
        return Balance;
    }

    public void setAccholder(String Accholder) {
        this.Accholder = Accholder;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public void addCredit(int credit) {
        Balance += credit;
    }

    public void adddebit(int debit) {
        Balance -= debit;
    }
}

