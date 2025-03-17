import java.util.Scanner;
 class Main {
     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
         System.out.print("ticket price ");
        int x = input.nextInt();
         System.out.print(" age ");
        int age = input.nextInt();
        if(age<12){
            x = x * 50/100;
            System.out.println("ticket price:" +x);

        }
         
            if(age>=60){
                x=x*30/100;
                System.out.println("ticket price:" +x);
            
         }
            else{
                x = +x ;
                System.out.println("ticket price:" +x);
            }
            }
        }
 

