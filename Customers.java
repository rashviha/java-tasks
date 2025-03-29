import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customers {
   static int cusid = 1;
   static List<Customers> cus = new ArrayList<>();

   int cusId;
    
            String cusPhno;
   String cusName,cusEmail;

    public Customers(String name, String mail, String phno,int id) {
        this.cusName=name;
        this.cusEmail=mail;
        this.cusPhno=phno;
        this.cusId=id;
    }

    public static void createCustomer()
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = in.nextLine();
       System.out.println("Enter your Email: ");
       String mail = in.nextLine();
       System.out.println("Enter your Phone Number: ");
       String phno = in.nextLine();
       Customers cusobj = new Customers(name,mail,phno,cusid);
       cus.add(cusobj);
       cusid++;
   }

   static void display()
   {
       for(int i=0;i<cus.size();i++)
       {
           System.out.println("Customer Name: "+cus.get(i).cusName);
       }
   }

}