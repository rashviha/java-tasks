import java.util.Scanner;
class Main {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
         System.out.print("enter percentage ");
        int percentage = scanner.nextInt();
         System.out.print("enter income ");
        int income = scanner.nextInt();
        if(percentage<85){
            
        }
        if(income<500000){
             System.out.print(" elligible ");
        }
        else{
             System.out.print("not elligible ");
        }
 }
}
