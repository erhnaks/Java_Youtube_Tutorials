package tutorial;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		System.out.print("input your age: ");
		Scanner sc = new Scanner(System.in);
		int scanned = sc.nextInt();
		String s = sc.nextLine();
		
		int age = Integer.parseInt(s);
		
		// FIRST CODE PRINTING HELLO WORLD;
		
	//	System.out.println("Hello World! it is me Erhan!"); this line will print whatever is in the quotation mark.
		
		// DATA TYPES;
		
	// below is the basic data types within the Java
//		int hello_world = 9;
//		double num2 = 5.0;
//		boolean b = false;
//		char c = 'h';
//		String str = "tim9";
//		
//		int erhan = hello_world;
//		
//		System.out.println(erhan + hello_world);

		// BASIC OPERATIONS & CALCULATIONS;
//		
//		int x = 5;
//		int y = 7;
//		int z = 56;
//		int sum = x + y + z;
//				
//		System.out.println(sum);
//		
		if (age >= 13) {
			System.out.println("You can ride");
	}
	
	else {
		
		System.out.println("You can not ride!");
	}
	
	
	
	
	
	
	}
	
}		
	
