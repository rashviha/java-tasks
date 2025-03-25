package PROGRAM;
import java.util.Scanner;
public class exception {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter b value:");
		int b=in.nextInt();
		int a=10;
	try {
		 a=a/b;
	}
	catch(Exception e) {
		System.out.println("ENter the proper value:");
		b=in.nextInt();
		a=a/b;
	}
	finally {
		System.out.println("Execution completed");
	}
}
}