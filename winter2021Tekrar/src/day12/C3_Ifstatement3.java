package day12;

import java.util.Scanner;

public class C3_Ifstatement3 {

	public static void main(String[] args) {
		/*
		 * ask user to enter a year type a java code by using if else statement write a
		 * program to check if a year is leap or not if the year is divisible by 100
		 * then it must be divisible by 400. if a year is not divisible by 100 then it
		 * must be divisible by 4.
		 */

		System.out.println("Please enter a year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (year % 400 == 0) {
			System.out.println("it is a leap year");
		} else if (year % 100 != 0 && year % 4 == 0) {
			System.out.println("it is a leap year");
		} else {
			System.out.println("it is not a leap year");
		}

		scan.close();

	}
}
