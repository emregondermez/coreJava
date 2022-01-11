package day12;

import java.util.Scanner;

public class C8_ternary3 {

	public static void main(String[] args) {
		// ask user to an integer
		// if the number has 3 digits, output will be "the number has 3 digits"
		// otherwise, output will be "the number has no 3 digits"
		// How can we decide the number of digits of an integer?

		System.out.println("Please enter a integer that has 3 digits");

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		String result = a<=999 && a>=100 ? "the number has 3 digits" : "the number has no 3 digits";
		System.out.println(result);
			
		
		
		
		
		
		
		
		
		scan.close();
	}

}
