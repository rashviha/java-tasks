package PROGRAM;
class payvia{
    void pay(int amount){
        System.out.println("in hand amount:"+amount);
    }
}
class creditupi extends payvia{
    void pay(int amount){
        System.out.println("UPI amount:"+amount);
    }
}
class Gpay extends payvia{
    void pay(int amount){
        System.out.println("Gay amount:"+amount);
    }
} 
class paymentprocessing{
    public static void main(String[] args){
        payvia ref;
        ref=new creditupi();
        ref.pay(20000);
        ref= new Gpay();
        ref.pay(4000);
        
    }
}
