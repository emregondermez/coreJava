package day12;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		/*
		 * type a java code by using if statement. a school has following rules for
		 * grading system: 1. Below 50- D 2. 50 to 59-C 3. 60 to 79- b 4.from 80 to
		 * 100-A
		 */

		System.out.println("Please enter your grade");
		Scanner scan = new Scanner(System.in);
		double grade = scan.nextDouble();

		if (grade >= 0 && grade < 50) {
			System.out.println("your grade is " + 'D');
		} else if (grade >= 50 && grade < 60) {
			System.out.println("your grade is " + 'C');
		} else if (grade >= 60 && grade < 80) {
			System.out.println("your grade is " + 'B');
		} else if (grade >= 80 && grade <= 100) {
			System.out.println("your grade is " + 'A');
		} else {
			System.out.println("please enter a valid value");
		}

		scan.close();
	}

}
