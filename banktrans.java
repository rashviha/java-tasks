package PROGRAM;
class Banktrans{
	void pay(int amount) {
		System.out.println("in hand amount:"+amount);
	}
}
class Otherbank extends Banktrans{
    void pay(int amount){
        System.out.println("transfered amount"+amount);
    }
}

public class Banking {
	public static void main(String[] args) {
	       Banktrans ref;
	       ref = new Otherbank();//object for credit class
	       ref.pay(2000);
	    }

}