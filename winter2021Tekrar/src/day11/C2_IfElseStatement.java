package day11;

import java.util.Scanner;

public class C2_IfElseStatement {

	public static void main(String[] args) {
		// ask to user enter a integer
		// if the integer is even print "even" on the console
		// if the integer is odd print "odd" on the console

		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		scan.close();		

	}
}
