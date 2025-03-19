import java.util.*; //to call all the packages
class getchar {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter a character:");
        Character ch =ref.nextLine().charAt(0);
        System.out.println(ch);
    }
}