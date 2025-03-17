import java.util.Scanner;
class Main {
   
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number (1 to 7) to get the day of the week ");
        int day = scanner.nextInt();
        
      switch(day){
            case 1 -> System.out.print("Monday");
             case 2 -> System.out.print("tuesday");
             case 3 -> System.out.print("wednesday");
             case 4 -> System.out.print("thursday");
             case 5 -> System.out.print("friday");
             case 6 -> System.out.print("saturday");
             case 7 -> System.out.print("sunday");
        }
        
     }
    
}
