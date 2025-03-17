import java.util.Scanner;
class Main {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
         System.out.print("Enter age ");
        int age = scanner.nextInt();
        if(age<18){
            System.out.print("not elligible ");
        }
        else{
             System.out.print(" elligible ");
        }
 }
}
