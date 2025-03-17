import java.util.Scanner;
class Main {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
         System.out.print("theory mark:");
         int theory = scanner.nextInt();
         System.out.print("practical marks:");
         int practical = scanner.nextInt();
         int total = theory+practical;
         
         if(theory>40 && practical>30){
            System.out.println("Pass");

         }
         if(total>=70){
            System.out.println("Pass");
         }
         else{
            System.out.print("fail");
         }

     }
}