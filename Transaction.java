class Transaction {
    void processTransaction(int amount) {
        System.out.println("Processing transaction of amount: " + amount);
    }
}
class BankTransfer extends Transaction {
    void processTransaction(int amount) {
        System.out.println("Processing Bank Transfer of amount: " + amount);
    }
}
class UPITransfer extends Transaction {
    void processTransaction(int amount) {
        System.out.println("Processing UPI Payment of amount: " + amount);
    }
}
class CreditCardPayment extends Transaction {
    void processTransaction(int amount) {
        System.out.println("Processing Credit Card Payment of amount: " + amount);
    }
}
class BANKTRANSACTION{
    public static void main(String[] args) {
        Transaction transaction;
        transaction = new BankTransfer();
        transaction.processTransaction(15000); 
        transaction = new UPITransfer();
        transaction.processTransaction(5000);   
        transaction = new CreditCardPayment();
        transaction.processTransaction(10000); 
}
}

