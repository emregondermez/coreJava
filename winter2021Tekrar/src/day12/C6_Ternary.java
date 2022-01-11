package day12;

import java.util.Scanner;

public class C6_Ternary {

	public static void main(String[] args) {
		/*
		 * Type a java code by using ternary and if else, ask use to enter an integer if
		 * the integer is even, the output will be "the integer is even" if the integer
		 * is odd, the output will be "the integer is odd"
		 */

		System.out.println("Please enter an integer");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		String result = num % 2 == 0 ? "the integer is even" : "the integer is odd";
		System.out.println(result);

		/*
		 * type a java code by using ternary. ask user to two integers write a program
		 * to print the minimum one on the console
		 */

		System.out.println("please enter two integers to compare");
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		int result2 = num2 < num3 ? num2 : num3;
		System.out.println(result2);

		scan.close();
	}

}
