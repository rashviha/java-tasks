package PROGRAM;
class employee{
	void pay(double fixedsalary) {
		System.out.println("full time employee"+fixedsalary);
	}
	void pay(double sal ,int perhour) {
		double pt=sal*perhour;
		System.out.println("getting salalry for part-time"+pt);
		
	}
	void pay(double salary, int perhour, int bonus ) {
				double fl=(salary*perhour)+bonus;
				System.out.println("freelancer salary:"+fl);
	}
}
public class Salarycal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee ref= new employee();
        ref.pay(800);
        ref.pay(100,3);
        ref.pay(100,5,30);

	}

}