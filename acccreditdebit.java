//acc credit and debit
import java.util.Scanner;
class acccredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      Account ac = new Account("Rashviha", 2000000000);
        System.out.println("Account holder name: " + ac.getAccholder());
        System.out.println("Balance: " + ac.getBalance());
        ac.setAccholder("Dhilip");
        System.out.println("Updated account holder name: " + ac.getAccholder());
        System.out.print("Enter amount to credit: ");
        int creditAmount = scanner.nextInt(); 
        ac.addCredit(creditAmount);
        System.out.println("Updated balance: " + ac.getBalance());
        System.out.print("Enter amount to debit: ");
        int debitAmount = scanner.nextInt(); 
        ac.adddebit(debitAmount);
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
    //getacc
    public String getAccholder() {
        return Accholder;
    }
    //get bal
    public int getBalance() {
        return Balance;
    }
    //update name
    public void setAccholder(String Accholder) {
        this.Accholder = Accholder;
    }
    //update bal
    public void addCredit(int credit) {
        Balance += credit;
    }
     public void adddebit(int debit) {
        Balance -= debit;
    }
}

