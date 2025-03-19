import java.util.Scanner;
class nextline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        @SuppressWarnings("unused")
        String str=input.nextLine();
        System.out.print(a+1);
    }
}