import java.util.Scanner;

public class Customer{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("1 Create User \n 2 Display Users \n 3 Create Products \n 4 Display Products");
            System.out.println("Enter the Choice");
            int n = in.nextInt();

            switch(n)
            {
                case 1:{
                    Customers.createCustomer();
                    break;
                }
                case 2:{
                    Customers.display();
                    break;
                }
            }
        }
    }
}