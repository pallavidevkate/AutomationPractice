package systemscannerexamples;

import java.util.Scanner;

public class ScannerClassExample1 {

	public static void main(String[] args) {
		String s = "Hello, This is BasicJava.";
		Scanner scan = new Scanner(s);
		
		System.out.println("Boolean Result: " + scan.hasNext());
		
		System.out.println("String: " + scan.nextLine());
		scan.close();
		System.out.println("------------Enter your Details--------");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.println("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.println("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();
		
		}

}
