class acc{
    public static void main(String[] args){
        Account ac=new Account ("Rashviha",2000000000);
        System.out.println("Accholder name: "+ac.getAccholder());  //to get accholname
        System.out.println("Holder balance: "+ac.getBalance());    //to get balance
        
    }
}
class Account{
    private String Accholder;
    private long Balance;
    Account(String Accholder,long Balance){
        this.Accholder=Accholder;
        this.Balance=Balance;
        
    }
    public String getAccholder(){
        return Accholder;
    }
    public long getBalance(){
        return Balance;
    }
}
