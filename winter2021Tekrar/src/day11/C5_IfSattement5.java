package day11;

import java.util.Scanner;

public class C5_IfSattement5 {

	public static void main(String[] args) {
		// type java code by using if else if () statement
		// if both of two integers are positive, output will be sum of them,
		// if both of the two integers are negative, output will be the multiplication
		// of them.
		// otherwise:; output will be "I cannot add or multiply different signed
		// numbers"

		System.out.println("please enter your first number");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		System.out.println("please enter your second number");
		int number2 = scan.nextInt();

		if (number1 > 0 && number2 > 0) {
			System.out.println(number1 + number2);
		} else if (number1 < 0 && number2 < 0) {
			System.out.println(number1 * number2);
		} else if (number1 == 0 && number2 == 0) {
			System.out.println("0 is notr");
		} else {
			System.out.println("I cannot add or multiply different signed numbers");
		}

		scan.close();
	}

}
