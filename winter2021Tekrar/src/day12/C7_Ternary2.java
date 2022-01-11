package day12;

import java.util.Scanner;

public class C7_Ternary2 {

	public static void main(String[] args) {
		/*FIRST QUESTION
		 * type a java code by using ternary write a program to print absolute value of
		 * an integer entered by user -5==>5 and 5===> and 0==>0
		 */
		

		System.out.println("please enter a integer to absolute");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		int result = a < 0 ? -a : a;
		System.out.println(result);
		
		/*SECOND QUESTION
		 type a java code by using ternary
		 take values of length and width of a rectangle from user and check if it is square or not
		 */
		
		System.out.println("second question");
		System.out.println("please enter lenght and width of the rectangle");
		double k1 = scan.nextDouble();
		double k2 = scan.nextDouble();
		
		String result2 = k1==k2 ? "it is a square" : "it is not a square";
		System.out.println(result2);
		
		
		
		
	scan.close();
	}

}
