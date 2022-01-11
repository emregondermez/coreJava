package day12;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		/*
		 * Ask to use enter annual salary, if the salary is more than $80.000 output
		 * will be "I accept the offer", if the salary is between $60.000 and $80.000
		 * out put will be "I negotiate to increase", otherwise output will be
		 * "I do not accept the offer"
		 */

		System.out.println("Please enter your salary offer");
		Scanner scan = new Scanner(System.in);
		double offer = scan.nextDouble();

		if (offer > 80000) {
			System.out.println("I accept the offer");
		} else if (offer >= 60000) {
			System.out.println("I negotiate to increase");
		} else if (offer <= 0) {
			System.out.println("Are you kidding me!!");
		} else {
			System.out.println("I do not accept the offer");
		}

		scan.close();
	}

}
