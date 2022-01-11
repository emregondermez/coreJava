package day12;

import java.util.Scanner;

public class C4_NestedIf {

	public static void main(String[] args) {
		// Type java code by using nested if() statement.
		// write a program to check if a year is leap year or not
		// if the year divisible by 100 then it must be divisible by 400.
		// if a year is not divisible by 100 then it must be divisible by 400.

		System.out.println("please enter a year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (year < 0) {
			System.out.println("please enter a valid year");
		} else if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println(year + " is a leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}

		} else {
			System.out.println("enter a valid value");
		}

		scan.close();
	}

}
