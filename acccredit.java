import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account ac = new Account("Rashviha", 2000000000);
        System.out.println("Account holder name: " + ac.getAccholder());// To Print the current account holder's name and balance
        System.out.println("Balance: " + ac.getBalance());
        
        // Update the account holder's name
        ac.setAccholder("Dhilip");
        System.out.println("Updated account holder name: " + ac.getAccholder());
        
        System.out.print("Enter amount to credit: ");
        int creditAmount = scanner.nextInt(); 
        
        ac.addCredit(creditAmount);
        
        // Print the updated balance
        System.out.println("Updated balance: " + ac.getBalance());
        
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

    public void addCredit(int credit) {
        this.Balance += credit;
    }
}
